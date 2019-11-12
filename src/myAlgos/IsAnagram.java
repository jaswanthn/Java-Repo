package myAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IsAnagram {


    public static void main(String[] args) {
        isAnagram("kite", "etik");

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("abc","efg","abb"));

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }


    public static boolean isAnagram1(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("NOt an anagram");
            return false;
        }

        // sort approach

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Is Anagram");
            return true;
        } else {
            System.out.println("Not an Anagram");
            return false;
        }

    }

    public static boolean isAnagram(String str1, String str2) {
        // sum approach

        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            sum1 += str1.charAt(i);
            sum2 += str2.charAt(i);

        }

//        Character c = '1';
//        System.out.println(Character.getNumericValue(c));

        if (sum1 == sum2) {
            System.out.println("is Anagram");
            return true;
        } else {
            System.out.println("is not Anagram");
            return false;
        }

    }


}
