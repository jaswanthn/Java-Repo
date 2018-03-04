package myAlgos;

import java.util.Arrays;

public class MaxNonNegativeSubArray {

    public static void main(String[] args) {

        MaxNonNegativeSubArray max = new MaxNonNegativeSubArray();

        int[] arr = max.maxset(new int[] {336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421});

        for (int i: arr) {
            System.out.println(i);
        }
    }
    public int[] maxset(int[] A) {

        long maxSum = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        long sum = 0;
        int tempStart = 0;
        int tempEnd = 0;
        for (int i = 0; i < A.length; i++) {

            // if current value is positive
            if (A[i]>=0) {
                sum += A[i];
                tempEnd = i;
                // compare max sum with curr sum
                if (sum >= maxSum) {
                    // update max index
                    if (sum == maxSum && (maxEndIndex - maxStartIndex) > (tempEnd - tempStart)) {
                        continue;

                    } else {
                        maxStartIndex = tempStart;
                        maxEndIndex = tempEnd + 1;
                        maxSum = sum;
                    }
                }

            } else {
                sum = 0;
                tempStart = i + 1;
            }

        }

        //maxEndIndex = maxEndIndex == 0 ? 0 : maxEndIndex + 1;

        return Arrays.copyOfRange(A, maxStartIndex, maxEndIndex);
    }

}