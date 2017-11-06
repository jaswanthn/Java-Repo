package filesIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FilesEx3 {

    public static void fileCopyWithoutDuplicates(String source, String dest) {

        try {

            String str = new String(Files.readAllBytes(Paths.get(source)));

            String[] strArr = str.split(" |\n");

            int noOfDuplicates = 0;

            for (int i=0; i < strArr.length; i++) {
                for (int j=i+1; j < strArr.length; j++) {
                    if (strArr[j] != null && strArr[i] != null) {
                        if (strArr[i].equals(strArr[j])) {
                            noOfDuplicates++;
                            strArr[j] = null;
                        }
                    }
                }

            }

            String[] strArrWithoutDup = new String[strArr.length - noOfDuplicates];

            int temp = 0;

            for (int y=0; y < strArr.length; y++) {

                if (strArr[y] != null) {
                    strArrWithoutDup[temp] = strArr[y];
                    temp++;
                }
            }


            //LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(strArr));

            PrintWriter pw = new PrintWriter(new FileWriter(dest));

            for (String s : strArrWithoutDup) {
                pw.print(s);
                pw.print(" ");
            }

            pw.flush();
            pw.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        FilesEx3.fileCopyWithoutDuplicates("filewithdup.txt", "filewithoutdup.txt");
    }


}
