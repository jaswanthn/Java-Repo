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

            result.addAll(temp);

        }
        return result;

    }

    // recursive solution - which uses backtracking concept
    public List<List<Integer>> printSubsetUsingBT(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        printSubsetsUsingBTHelper(result, new ArrayList<>(), arr, 0);
        return result;
    }

    private void printSubsetsUsingBTHelper(List<List<Integer>> result, ArrayList tempList, int[] arr, int start) {

       result.add(new ArrayList<>(tempList));

       for (int i = start; i < arr.length; i++) {
//           if (tempList.contains(arr[i]))
           // choose
           tempList.add(arr[i]);
           // explore
           printSubsetsUsingBTHelper(result, tempList, arr, i+1);
           // unchoose
           tempList.remove(tempList.size() - 1);
       }
    }

    public static void main(String[] args) {
        Subsets subsetObj = new Subsets();
//        System.out.println(subsetObj.printSubsets(new int[]{1,2,3}));
        System.out.println(subsetObj.printSubsetUsingBT(new int[]{2,1,3}));

    }
}
