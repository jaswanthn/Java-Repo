package myAlgos;

import java.util.Arrays;

public class NobleInteger {

    public int solve(int[] A) {
        // sort the array
        Arrays.sort(A);

        for (int i = A.length - 1; i >= 0; i--) {
            // find next remaining elements
            if ((A.length - i - 1) == A[i] && (i == A.length - 1 || A[i] != A[i+1])) {
                // address case of last element
                    return 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        NobleInteger ni = new NobleInteger();
        System.out.println(ni.solve(new int[]{ -4, -2, 0, -1, -6}));
    }
}
