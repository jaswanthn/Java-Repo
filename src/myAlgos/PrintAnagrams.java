package myAlgos;

import java.util.Arrays;

public class PrintAnagrams {

    public static void main(String[] args) {
        //showAnagrams("ABC", 0, 3);

//        char[] charArr = {'a', 'b', 'c'};
//        System.out.println(charArr.toString());
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(String.valueOf(charArr));

        String str = "abc";
        System.out.println(str.substring(0,0));
    }

    public static void showAnagrams(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        }

        else {
            for (int i = l; i < r; i++) {
                str = swap(str, l, i);
                showAnagrams(str, l+1, r);
                //str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char[] chArr = str.toCharArray();
        char temp = chArr[l];
        chArr[l] = chArr[i];
        chArr[i] = temp;
        return String.valueOf(chArr);
    }


}
