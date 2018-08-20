package myAlgos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {


    public static void main(String[] args) {

       int[][] intArr = {{5,7},{9,11},{1,4},};

        System.out.println("isOverlapping: " + isOverlappingIntervals(intArr));

    }

    public static boolean isOverlappingIntervals(int[][] arr) {

        // sort the array elements based on starting index of each row
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i][1] > arr[i+1][0]) {
                return true;
            }
        }
        return false;


    }

}
