package myAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindSecondLargest {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,5,3,8));
        System.out.println(secondLargest(ar));
    }

    public static int secondLargest(ArrayList<Integer> arr) {
        arr.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a > b) {
                    return 1;
                } else return -1;
            }
        });

        return arr.get(1);

    }

    public static int secondLargest(int[] A) {
        Arrays.sort(A);
        return A[1];
    }

}
