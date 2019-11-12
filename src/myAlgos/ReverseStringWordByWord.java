package myAlgos;

import java.util.Arrays;

public class ReverseStringWordByWord {

    public static void main(String arg[]) {
        System.out.println(reverseWords("the sky is blue"));
    }


    public static String reverseWords(String str) {

        if (str.length() == 0) return "";

        String[] strArr = str.split(" ");

        int length = strArr.length;

        for (int i = 0; i < length / 2; i++) {
            String temp = strArr[i];
            strArr[i] = strArr[length - 1 - i];
            strArr[length - 1 - i] = temp;
        }

        /// works only in Java 8
        //return String.join(" ", strArr);
        return Arrays.toString(strArr)
                .replaceAll("\\[|\\]|\\,", "");
    }
}
