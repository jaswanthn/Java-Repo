package myAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    // all subsets items should be in asc order
    // no two subsets should be same (uniqueness)
    // should contain empty subset as well
    public List<List<Integer>> printSubsets(int[] arr) {

        // make sure the array is sorted
        Arrays.sort(arr);
        // we need array list of list to store the result
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {


            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> item: result) {
                List<Integer> sublist = new ArrayList<>(item);
                sublist.add(arr[i]);
                temp.add(sublist);
            }

            // add single items
            temp.add(new ArrayList<>(new ArrayList<>(Arrays.asList(arr[i]))));
//            System.out.println(temp + " " + arr[i]);

            result.addAll(temp);

        }
        return result;

    }

    public static void main(String[] args) {
        Subsets subsetObj = new Subsets();
        System.out.println(subsetObj.printSubsets(new int[]{1,2,3}));
    }
}
