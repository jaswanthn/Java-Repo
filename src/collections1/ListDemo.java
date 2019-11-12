package collections1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListDemo {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            StringBuffer sb = new StringBuffer();

            while(true) {
                String str = br.readLine();
                if (str != null) {
                    sb.append(str);
                } else break;
            }

            ArrayList arrl = new ArrayList(Arrays.asList(sb.toString().split(" ")));

            System.out.println("Enter word to search in file");
            Scanner sc = new Scanner(System.in);
            String toFind = sc.next();

            if(wordExists(arrl, toFind))
                System.out.println("Word exists");
            else
                System.out.println("Word doesn't exist");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean wordExists(ArrayList al, String target) {
        return al.contains(target) ? true : false;
    }
}
