package myAlgos;

import java.util.Arrays;

public class ReplaceStringSpaces {

    public static void main(String[] args) {
        System.out.println(removeSpaces("aab ssg i"));
    }

    public static String removeSpaces(String str) {
        int noOfSpace = 0;

        char[] strArr = str.toCharArray();

        for (int i=0; i < str.length(); i++) {
            if (strArr[i]==' ') {
                noOfSpace++;
            } else {
                strArr[i -noOfSpace] = strArr[i];
            }
        }

        String finalString = String.valueOf(Arrays.copyOf(strArr, str.length() - noOfSpace));

        return finalString;
    }
}
