package interviewCake;

import java.util.Arrays;

public class ReverseInPlace {

    // test method - start
    public static void main(String[] args) {
        ReverseInPlace.reverseArrayInPlace(new char[]{'a', 'b', 'c', 'd'});
    }

    public static void reverseArrayInPlace(char[] srcArray) {

        // if array is not empty or 1
        if (srcArray.length > 1) {
            for (int i = 0; i < srcArray.length/2; i++) {
                swap(i, srcArray.length - i - 1, srcArray);
            }
        }

        //  String res = Arrays.toString(srcArray);

        StringBuilder sb = new StringBuilder();

        System.out.println(srcArray);
    }

    private static void swap(int index1, int index2, char[] srcArray) {

        char temp = srcArray[index1];
        srcArray[index1] = srcArray[index2];
        srcArray[index2] = temp;

    }
}
