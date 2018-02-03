package myAlgos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <b>IDeserve <br>
 * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
 * Given a string, find all the permutations of the string.
 * For example:
 * Input String: abc
 * Output: {bca, acb, abc, cba, bac, cab}
 *
 * @author Saurabh
 */
public class AllPermutationsString {

    public static HashSet<String> getAllPermutations(String str) {
        // Create a hash set to prevent any duplicate entries
        HashSet<String> permutations = new HashSet<String>();

        if(str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
        String remainingString = str.substring(1);
        HashSet<String> words = getAllPermutations(remainingString);
        for(String word: words) {
            for(int i = 0; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                permutations.add(prefix + first + suffix);
            }
        }
        return permutations;
    }

    public static Set<Integer> getDuplicates(int[] array) {
        int n = array.length;
        Set<Integer> duplicates = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            // Make the array element at index array[i] negative if it is positive
            if(array[Math.abs(array[i])] > 0) {
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            } else {
                // If the element at index array[i] is negative, it means we have seen it before, so it is a duplicate
                duplicates.add(Math.abs(array[i]));
            }
        }
        return duplicates;
    }


    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> permutations = getAllPermutations(str);
        System.out.println(permutations.toString());
        int[] array = {2, 4, 5, 2, 6, 1, 6, 3, 5};
        Set<Integer> duplicates = getDuplicates(array);
        System.out.println(Arrays.toString(duplicates.toArray()));
    }
}