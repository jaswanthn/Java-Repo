import java.util.HashMap;
import java.util.HashSet;

public class MissingNumber {

    private int arr1[];
    private int arr2[];

    public int[] getArr1() {
        return  arr1;
    }

    public void setArr1(int[] arr) {
        arr1 = arr;
    }

    public int[] getArr2() {
        return  arr2;
    }

    public void setArr2(int[] arr) {
        arr2 = arr;
    }


    // assuming array1 doesn't contain duplicates
    public int findMissingNumber() {
        HashSet hs = new HashSet();

        for (int i=0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        for (int j=0; j < arr1.length; j++) {
            if(hs.add(arr1[j]) == false) {
                continue;
            } else {
                // this is the missing element since it was able to add to set
                return arr1[j];
            }
        }

        return 0;

    }

    public int findMissingNumberXor() {

        int res=0;

        int i;
        for (i=0; i < arr1.length - 1; i++) {
            res ^= arr1[i];
            res ^= arr2[i];
        }
        res ^= arr1[i];

        return res;
    }


}
