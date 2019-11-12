package interviewCake;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{3, 4, 6, 10, 11, 15}, new int[]{1, 5, 8, 12, 14, 19})));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // array1 and array2 are already sorted
        //initialize new array with length = sum of (length of arr1 + length of arr2)
        int[] resultArray = new int[arr1.length + arr2.length];
        int index1 = 0, index2 = 0, resultArrIndex = 0;

        while (index1 < arr1.length || index2 < arr2.length) {

            // case 1: if array1 is fulfilled
            if (index1 >= arr1.length) {
                while (index2 < arr2.length) {
                    resultArray[resultArrIndex++] = arr2[index2++];
                }
            } else if (index2 >= arr2.length) {
                while (index1 < arr1.length) {
                    resultArray[resultArrIndex++] = arr1[index1++];
                }
            } else {
                resultArray[resultArrIndex++] = (arr1[index1] <= arr2[index2] ? arr1[index1++] : arr2[index2++]);
            }
        }

        return resultArray;
    }
}
