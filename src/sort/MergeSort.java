package sort;

public class MergeSort {



    /**
     * [5 , 2, 1, 11, 9, 7]
     * use divide and conquer to solve merge sort
     * divide phase >> split each list into two using a mid value
     *                          [5 , 2, 1, 11, 9, 7, 3]
     *                                      |
     *  m = ( l + r )/ 2 =  3   [5, 2, 1, 11] [9, 7, 3]
     *                                |
     *       3 / 2 = 1          [5, 2] [11, 1] [9, 7] [3]
     *                             |
     *                          [5] [2] [11] [1]
     * conquer phase >> join two sublist into single by sorting while merge
     *                            [2, 5] [1, 11]
     *                            [1, 2, 5, 11]
     */

    // l indicates left index and r indicates right index
    public void mergeSort(int[] arr, int l, int r) {

        // check pre condition whether l and r are valid
        // left index should always be less than right index to divide
        if (l < r) {
            // find mid point to divide each list into two sublists
            int m = l + (r - l) / 2; // or m = (l + r)/2
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            // after dividing list recursively merge those sublists in merge phase
            merge(arr, l , m, r);

        }
    }


    // we get two sublists in the following format
    // 1st sublist >> arr[l ... m]
    // 2nd sublist >> arr[m+1 ... r]
    public void merge(int[] arr, int l, int m, int r) {

        // merge two above lists to one list and copy it to source
        // initialize two temp arrays with correct size
        int lengthOfFirstList = (m - l + 1);
        int lengthOfSecondList = r - m;

        // create two temp arrays to prepare for merge
        int temp1[] = new int[lengthOfFirstList];
        int temp2[] = new int[lengthOfSecondList];

        // save items in list before merge
        for (int i = 0; i < lengthOfFirstList; i++) {
            temp1[i] = arr[l + i];
        }

        for (int j = 0; j < lengthOfSecondList; j++) {
            temp2[j] = arr[m + 1 + j];
        }

        // compare and add them to main list
        int i = 0, j = 0, k = l;
        while (i < lengthOfFirstList && j < lengthOfSecondList) {
            // need to compare temp arrays since we need to merge from temp arrays
            if (temp1[i] < temp2[j]) {
                arr[k++] = temp1[i++];
            } else {
                arr[k++] = temp2[j++];
            }
        }

        // copy if there are any elements remaining in first list
        while (i < lengthOfFirstList) {
            arr[k++] = temp1[i++];
        }

        while (j < lengthOfSecondList) {
            arr[k++] = temp2[j++];
        }
    }


    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int [] arr = new int[] {5 , 2, 1, 11, 9, 7, 3};
        ms.mergeSort(arr, 0, 6);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
