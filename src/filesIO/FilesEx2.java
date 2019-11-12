package filesIO;

import Strings.StringAssgn1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesEx2 {

    public static void fileInfo(String fileName) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            int noOfChar = 0;
            int noOfWords = 0;
            int noOfLines = 0;

            String str;

            while ((str = br.readLine()) != null) {
                noOfLines++;
                if (str.length() > 0) {
                    // including spaces
                    noOfChar += str.length();
                    String[] arr = str.split(" ");
                    noOfWords += arr.length;
                }
            }

            System.out.println("No. of Lines: " + noOfLines + "\nNo. of Words: " + noOfWords + "\nNo. of Chars: " + noOfChar);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Input file doesn't exist");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        FilesEx2.fileInfo("student.txt");
    }
}
