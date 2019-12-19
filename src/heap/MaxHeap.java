package heap;

import java.util.*;

public class MaxHeap {

    public static void print() {
        System.out.println("to test");
    }
    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap();
        mh.print();
        int[] heapArray = { 1, 4, 21, 7, 12, 15, 14, 9, 2, 3, 16 };

        System.out.println("Before heapify: "+Arrays.toString(heapArray));
        new MaxHeap().buildMaxHeap(heapArray, heapArray.length);
        System.out.println("After heapify: "+Arrays.toString(heapArray));
        System.out.println(args);
    }

    // REMEMBER : only first n / 2 elements will contain parent

    public static int[] buildMaxHeap(int[] arr, int size) {

        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Enter valid input");
        }

        for (int i = size >>> 1; i >= 0; i--) {
            maxHeapify(arr, i, size);
        }

        return arr;

    }

    public static void maxHeapify(int[] arr, int index, int heapSize) {

        int largest = index;

        while (largest < heapSize / 2) { // only parent nodes need to be checked
            int leftChild = 2 * largest + 1; // left child
            int rightChild = 2 * largest + 2; // right child

            if (leftChild < heapSize && arr[largest] < arr[leftChild]) {
                largest = leftChild;
            }

            if (rightChild < heapSize && arr[largest] < arr[rightChild]) {
                largest = rightChild;
            }

            if (largest != index) {
                swap(arr, largest, index);
                index = largest;
            } else break;

        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}


