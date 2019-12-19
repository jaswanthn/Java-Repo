package myAlgos;

import java.util.Arrays;

public class ReplaceSpaceWithChars {


    public static void main(String[] args) {

        System.out.println(replaceWithChars(new String("This is a test")));

    }

    public static String replaceWithChars(String str) {

        char[] strArr = str.toCharArray();

        int length = str.length();

        int noOfSpaces = 0, i, newLength;

        for (i = 0; i < strArr.length; i++) {
            if (strArr[i] == ' ') {
                noOfSpaces++;
            }
        }

        newLength = strArr.length + 2 * noOfSpaces;

        // create array with full size
        strArr = Arrays.copyOf(strArr, newLength);

        //System.out.println(strArr + " " + strArr.length);

        for (i = length - 1; i >= 0; i--) {
            if (strArr[i] == ' ') {
                strArr[newLength - 1] = '0';
                strArr[newLength - 2] = '2';
                strArr[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                strArr[newLength - 1] = strArr[i];
                newLength = newLength - 1;
            }
        }

        return new String(strArr);
    }
}
