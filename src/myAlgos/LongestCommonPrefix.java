package myAlgos;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(lcpInArrayOfStrings(new String[]{"geeksforgeeks", "geeks", "geek"}));
//        System.out.println(lcpInArrayOfStringsCharByChar(new String[]{"geeksforgeeks", "geeks", "geek"}));

    }


    // word by word matching
    // lcp(string1, string2, string3) = lcp(lcp(string1, string2), string3)
    // end of iterations will have lcp of all strings
    public static String lcpInArrayOfStrings(String[] strArr) {

        // array length is zero hence return empty string
        if (strArr.length == 0) {
            return "";
        }

        int n = strArr.length;

        // take first string
        String prefix = strArr[0];


        for (int i=1; i < n; i++) {
            // pass two strings at a time to util class
            prefix = lcpUtil(prefix, strArr[i]);
        }

        return prefix;
    }

    // char by char matching
    public static String lcpInArrayOfStringsCharByChar(String[] strArr) {

        String prefix = "";

        // get minimum string length in array
//         Arrays.sort(strArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        //int min = strArr[0].length();

        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int l=0; l<strArr.length; l++) {
            int curr = Math.min(min, strArr[l].length());
            if (min != curr) minIndex = l;
            min = curr;
        }

        System.out.println(min);

        // check the first character till mismatch in all strings match
        for (int i = 0; i < min; i++) {
            char c = strArr[minIndex].charAt(i);
            for (int k = 1; k < strArr.length; k++) {
                if (strArr[k].charAt(i) != c)
                    return prefix;
            }
            prefix += c;
        }

        return prefix;
    }

    private static String lcpUtil(String prefix, String s1) {

        int n1 = prefix.length();
        int n2 = s1.length();

        n1 = (n1 <= n2) ? n1 : n2;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i < n1; i++) {
            if(prefix.charAt(i) != s1.charAt(i)) {
                break;
            }
            sb.append(prefix.charAt(i));
        }
        return sb.toString();
    }
}
