package interviewCake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordFreqeuency {

    private static HashMap wordCloud = new HashMap();

    private static List<String> splitWord(String phrase) {

        List<String> listOfSplitWords = new ArrayList<String>();


        // to store index instead of generating string using concatenation which takes o(n2) time complexity
        int currentWordStartIndex = 0;
        int currentWordLength = 0;

        for (int i = 0; i < phrase.length(); i++) {

            // check if current character is a letter
            if (Character.isLetter(phrase.charAt(i))) {
                // for first character
                if (currentWordLength == 0) {
                    currentWordStartIndex = i;
                }
                currentWordLength++;
            } else {
                String word = phrase.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                // use equals to avoid empty string check
                if (!word.equals(""))
                listOfSplitWords.add(word);
                currentWordLength = 0;
            }


        }

        return listOfSplitWords;

    }

    public static void main(String[] args) {

        System.out.println(splitWord("Add milk and eggs, then add flour and sugar"));

    }

//    public static void createWordCloud(String ) {
//
//    }

}
