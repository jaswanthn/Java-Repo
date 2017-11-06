package filesIO;

import java.io.*;

public class FilesEx1 {

    public static void main(String[] args) {

        try {

            // write to a file using print writer
            PrintWriter pw = new PrintWriter(new FileWriter("student.txt"));
            pw.println("Student Name: Ravi");
            pw.println("Age: 15");
            pw.println("Address: Guntur");
            pw.flush();
            pw.close();


            // read from a file using buffered reader - readLine() to get each line in string format
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            String st;

            while (( st = br.readLine()) != null) {
                System.out.println(st);
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
