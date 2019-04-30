package myAlgos;

import java.util.HashSet;

public class TargetElement {

    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{1, 3, 5, 6, 7}, 11));
    }

    // Complete the numberOfPairs function below.
    static int numberOfPairs(int[] a, long k) {

        int pairs = 0;
        // need hashset

        HashSet hs = new HashSet<Long>();

        for (Integer num : a) {
            if (hs.contains((long)num)) {
                pairs++;
            } else {
                hs.add(k - num);
            }
        }

        // Map<Integer, Integer> pairsMap = new HashMap<Integer, Integer>();
        // for (int num: a) {
        //     if (pairsMap.containsKey(k - num) && pairsMap.get(k - num) == 0) {
        //         pairs++;
        //         pairsMap.put(((int)k - num), pairsMap.get(k - num) + 1);
        //     } else if (!pairsMap.containsKey(num)) {
        //         pairsMap.put(num, 0);
        //     }
        // }

        return pairs;

    }

}
