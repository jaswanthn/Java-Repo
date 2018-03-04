package myAlgos;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

    public static void main(String[] args) {
        System.out.println("This is a test run");
        stringIteration("alabala");
    }

    public static void stringIteration(String str) {

        String rev  = "";
        for(int i=0; i < str.length(); i++) {
            rev =  str.charAt(i) + rev;
        }

        System.out.println(rev);

        // check palindrome

        boolean isPal = rev.equalsIgnoreCase(str);

        System.out.println(isPal);

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "jash");
        hm.put(2, "kiran");

        for (Map.Entry<Integer, String> me : hm.entrySet()) {
            System.out.println(me.getKey() + " :" + me.getValue());
        }
    }
}
