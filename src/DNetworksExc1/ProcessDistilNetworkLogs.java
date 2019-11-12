package DNetworksExc1;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ProcessDistilNetworkLogs {

    private static final int lengthOfSession = 20;

    private static long getTimeDifferenceInMinutes(String firstLogLine, String secondLogLine) {

        Date firstTS = new Date(Long.parseLong(firstLogLine.split("\t")[1].replace(".", "")));
        Date secondTS = new Date(Long.parseLong(secondLogLine.split("\t")[1].replace(".", "")));

        long noOfMinutes = TimeUnit.MILLISECONDS.toMinutes(secondTS.getTime() - firstTS.getTime());

        return noOfMinutes;

    }

    private static double calculateAveragePagesPerMinute(String fileName) throws IOException {


        // read log file from source
        BufferedReader bReader = new BufferedReader(new FileReader(fileName));

        String firstLogLine = bReader.readLine();

        // update last with recently accessed log line
        String lastLongLine = "";
        String temp = "";

        int pageCount = 1;

        while ((temp = bReader.readLine()) != null) {
            lastLongLine = temp;
            pageCount++;
        }

        // get total no. of minutes
        long totalMinutes = getTimeDifferenceInMinutes(firstLogLine, lastLongLine);

        // to avoid arithmetic exception
        if (totalMinutes == 0) totalMinutes = 1;

        return (1.0 * pageCount / totalMinutes);

    }

    private static HashMap<String, Double> calculateAverageNoOfPagesPerSession(String fileName) throws IOException {

        // average pages per session = (total no. of pages /  total no. of sessions)

        // hashmap to store each IP and their count of appearance in the log
        HashMap<String, Double> IpCountMap = new HashMap<String, Double>();

        BufferedReader bReader = new BufferedReader(new FileReader(fileName));

        String prevRequest = "";
        String currentRequest;
        int totalNoOfSessions = 1;

        while ((currentRequest = bReader.readLine()) != null) {

            // always check if same session
            // (check two consecutive requests have more than 20 mins time difference)
            if (prevRequest != "" && getTimeDifferenceInMinutes(prevRequest, currentRequest) >= lengthOfSession) {
                totalNoOfSessions++;
            }

            // store IP if new else update count
            String currIp = currentRequest.split("\t")[0];

            if (IpCountMap.containsKey(currIp)) {
                double IpPageCount = IpCountMap.get(currIp);
                IpCountMap.put(currIp, ++IpPageCount);
            } else {
                IpCountMap.put(currIp, 1.0);
            }

            prevRequest = currentRequest;

        }

        for (Map.Entry<String, Double> item : IpCountMap.entrySet()) {
            String ip = item.getKey();
            double totalCount = item.getValue();
            IpCountMap.put(ip, totalCount / totalNoOfSessions);
        }


        return IpCountMap;

    }

    public static void main(String[] args) {

        try {
            PrintWriter pr = new PrintWriter(new FileWriter("DN_Log_Results_01.tsv"));

            double result1 = ProcessDistilNetworkLogs.calculateAveragePagesPerMinute("distilAccessLog.tsv");
            pr.println("********* -------- ************ --------- ********");
            pr.println("1. Average Pages Per Minute: " + result1);

            HashMap<String, Double> hm = ProcessDistilNetworkLogs.calculateAverageNoOfPagesPerSession("distilAccessLog.tsv");
            pr.println("2. Average Pages Per Session for each IP: ");
            for (Map.Entry<String, Double> item : hm.entrySet()) {
                pr.println("For IP: " + item.getKey() + " average pages per session = " + item.getValue());
            }
            pr.println("********* -------- ************ --------- ********");
            pr.flush();
            pr.close();

        } catch (IOException e) {
            System.out.println("Input valid file name");
            e.printStackTrace();
        }

    }

}
