package interviewCake;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.printf(binarySearch(new int[]{1, 2, 3, 4, 5}, 1).toString());
    }

    public static Boolean binarySearch(int[] arr, int target) {

        // ceiling and floor should be boundaries/walls which initially start from first and last of array
        int floorIndex = 0;
        int ceilIndex = arr.length - 1;

        // loop in to check if middle element matches target or set floor/ceil accordingly

        while(floorIndex <= ceilIndex) {

//            int halfDistanceIndex = (ceilIndex - floorIndex) / 2;
            int guessIndex = (floorIndex + ceilIndex) / 2;
            int guessValue = arr[guessIndex];

            if (guessValue == target) return true;
            else if (guessValue > target) {
                // target should be on left hence move ceil to left
                ceilIndex = guessIndex -  1;
            } else {
                // target is on right so move floor to right
                floorIndex = guessIndex + 1;
            }
        }

        return false;

    }
}
