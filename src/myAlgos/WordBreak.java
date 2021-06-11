package myAlgos;

import java.util.HashSet;

public class WordBreak {

    // dictionary is a member variable data structure
    public static HashSet<String> hs = new HashSet<>();

    public static void main(String args[]) {
        hs.add("this");
        hs.add("is");
        hs.add("a");
        hs.add("test");

        System.out.println(checkWordBreakInString("this"));
        //System.out.println(checkWordsUsingReplace("thisisatest"));

    }


    public static boolean checkWordBreakInString(String str) {

        // to check for the substring in dictionary
        // use dynamic style programming to achieve the solution

        // use variable to save string length
        int n = str.length();

        // boolean array to keep track of word match
        boolean[] wordMatch = new boolean[n];

        for (int i = 0; i < n; i++) {
            // check each substring in dictionary
            if (hs.contains(str.substring(0, i+1)) || wordMatch[i]){
                wordMatch[i] = true;

                // now start from i+1
                for (int k = i+1; k < n; k++) {
                    if (hs.contains(str.substring(i+1, k+1))) {
                        wordMatch[k] = true;
                    }
                    // check if this is the last item and set to true
                    if (k == n - 1 && wordMatch[k] == true) {
                        return true;
                    }
                }
            }
        }

        return wordMatch[n-1];

    }

    public static boolean checkWordsUsingReplace(String str) {

        // iterate through dictionary and replace original string
        for (String word: hs) {
            str = str.replaceFirst(word, "");
        }

        // check if string is empty
        return (str.length() == 0);
    }
}
