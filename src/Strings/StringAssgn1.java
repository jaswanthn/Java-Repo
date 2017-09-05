package Strings;

import java.util.Scanner;

public class StringAssgn1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome\n----------------------------------");
        System.out.println(StringAssgn1.checkPalindrome(sc.nextLine()));

        System.out.println("Enter string to split with delimeter\n--------------------------------------");
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter delimeter");
        String str1 = sc.nextLine();
        StringAssgn1.splitString(str, str1);

        System.out.println("Enter string to remove duplicates");
        StringAssgn1.removeDuplicates(sc.nextLine());
    }

    public static boolean checkPalindrome(String str) {

        String rev = "";

        try {
            if (str == null || str.length() == 0) throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.println("Enter valid String");

        }

        int strLength = str.length();
        for (int i=strLength-1; i>=0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev) ? true : false;
    }

    public static String[] splitString(String str, String del) {

        String[] res;

        if (str.length() > 0 && del.length() >= 0) {
            if (del.length() == 0) {
                res = str.split(" ");
            } else {
                res = str.split(del);
            }
        } else {
            // update reference to empty string array
            res = new String[0];
        }

        System.out.println("words after split: ");
        for (String r : res) {
            System.out.println(r + "\t");
        }

        return res;
    }

    public static void removeDuplicates(String str) {

        String[] arrOfWords = str.split(" ");
        System.out.println("No. of words in a string: "  + arrOfWords.length);

        int noOfDuplicates = 0;


        for (int i=0; i < arrOfWords.length; i++) {
            for (int j=i+1; j < arrOfWords.length; j++) {
                if (arrOfWords[j] != null && arrOfWords[i] != null) {
                    if (arrOfWords[i].equals(arrOfWords[j])) {
                        noOfDuplicates++;
                        arrOfWords[j] = null;
                    }
                }
            }

        }


        System.out.println("Number of duplicate words: " + noOfDuplicates );

        System.out.println("string without duplicates\n--------------------------");
        for (String s : arrOfWords) {
            if (s != null) {
                System.out.print(s + " ");
            }
        }

    }
}
