package filesIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesEx4 {

    public static void noOfOccurances(String fileName, String key) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            StringBuffer sb = new StringBuffer();

            String s = "";

            while ((s = br.readLine()) != null) {
                sb.append(" ");
                sb.append(s);
            }

            int noOfOccurances = 0;

            String[] strArray = sb.toString().split(" ");

            for (String st : strArray) {
                if (st.equals(key)) {
                    noOfOccurances++;
                }
            }

            System.out.println("Total Number of Occurances of the word: " + noOfOccurances);

        } catch (FileNotFoundException e) {
            System.out.println("Enter valid file name");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FilesEx4.noOfOccurances("wordoccurance.txt", "repeated");
    }
}
