package myAlgos;

import java.util.*;

public class EasyPermutation {

    // using simple recursion and constructing prefix in each call
    public static void permutation(String prefix, String str) {
        int n = str.length();

        if (n<=0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n));
        }
    }

    // using backtracking technique on array of integers
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(result, new ArrayList<Integer>(), nums);
        return result;
    }

    private void permuteHelper (List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums) {
        // base case
        System.out.println(tempList);
        if (tempList.size() == nums.length) {

            result.add(new ArrayList<>(tempList));
            return;
        }


        for (int i=0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue;
            // choose
            tempList.add(nums[i]);
            // explore
            permuteHelper(result, tempList, nums);
            // unchoose
            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args) {
        permutation("", "ABCD");
    }
}
