package myAlgos;

import java.util.*;

public class KMostFrequentElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findKMostFrequentElements(new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}, 4)));
    }


    public static int[] findKMostFrequentElements(int[] A, int k) {

        // find frequency of each element and store it in hash map
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        // store them in treeMap with frequency as key and ArrayList as value
        TreeMap<Integer, ArrayList<Integer>> bucketMap = new TreeMap<>();
        for (int number : hm.keySet()) {
            ArrayList al = bucketMap.getOrDefault(hm.get(number), new ArrayList<>());
            al.add(number);
            bucketMap.put(hm.get(number), al);
        }


        // now convert all arrayList values to single arrayList from tree map
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (ArrayList<Integer> preResList : bucketMap.values()) {
            res.addAll(preResList);
        }

        System.out.println(res);


        // return the first required entries
        int[] finalres = new int[k];
        int resSize = res.size();
        // check if k is greater than existing result set
        // if so reduce it to max available
        if (k > resSize) k = resSize;
        for (int j=0; j < k; j++) {
            finalres[j] = res.get(resSize - j - 1);
//            System.out.println(finalres[j]);
        }

        return finalres;

    }

}
