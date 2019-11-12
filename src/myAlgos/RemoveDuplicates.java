package myAlgos;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicatesFromString(String str) {

        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (lhs.contains(c)) {
                lhs.remove(c);
                lhs.add(c);
            } else {
                lhs.add(c);
            }
        }

        return lhs.toString();


    }

    public static void main(String[] args) {

        System.out.println(removeDuplicatesFromString("abcadba"));
    }

}
