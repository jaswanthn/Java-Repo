package myAlgos;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String[] strArr = new String[]{"co", "dili", "itya"};
        System.out.println(solution.sol(strArr));
    }

    public static int sol(String[] A) {

        StringBuilder result = new StringBuilder();
        for (int i=0; i < A.length; i++) {

            // check if the string has unique chars
            if(checkIfUnique(A[i])) {
                if(checkIfUnique(result.toString() + A[i])) {
                    result.append(A[i]);
                }
            }
        }

        return result.length();

    }

    public static boolean checkIfUnique(final String str) {
        char[] chArray = str.toCharArray();

        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1])
                continue;

                // if at any time, 2 adjacent elements
                // become equal, return false
            else
                return false;
        }
        return true;
    }


}
