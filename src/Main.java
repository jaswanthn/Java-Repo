import java.util.*;
public class Main {

    public static void main(String[] args) {
        String myName = new String("jaswanth");
        System.out.println("Hello World!");
        Main.Palindrome(new String("malalam"));
        System.out.println(Main.removeChar('j', myName));
        System.out.println(RecursionTypes.fibonocci(5));
        System.out.println(FindOdd.oddManOut(new int[]{ 2, 3, 4, 3, 1, 4, 5, 1, 4, 2, 5}) );

        // test missing number problem
        MissingNumber mn = new MissingNumber();
        mn.setArr1(new int[] {9, 7, 8, 5, 4, 6, 2, 3, 1});
        mn.setArr2(new int[] { 2, 4, 3, 9, 1, 8, 5, 6});


        System.out.println(mn.findMissingNumberXor());
        int max = MaxSquare.maxSquareinMatrix(new int[][] {{1,1,0,0,1,1},{0,0,1,0,1,1},{1,1,1,1,1,0},{1,1,1,1,1,1},
                {1,1,1,1,1,1},{0,1,1,1,1,1},{1,0,0,0,1,1}});
        System.out.println("Max size square sub matrix: " + max);

    }

    public static void Palindrome(String x) {
        if (x != null && x.length() > 0) {
            if (x.equals(Main.reverseString(x))) {
                System.out.println(" this is a palindrome ");
            } else {
                System.out.println(" this is not a palindrome ");
            }
        } else {
            System.out.println(" please input a valid string ");
        }
    }


    private static String reverseString(String y) {
        String res = "";
        for (int i = 0; i < y.length(); i++ ) {
            res += y.charAt(y.length() - i -1);
        }
        return res;
    }

    private static String removeChar(char c, String str) {
        int index; boolean found = false;
        for (index = 0; index < str.length(); index++) {
            if (str.charAt(index) == c) {
                found = true;
                break;
            }
        }
        if (found) {
        return str.substring(0,index) + str.substring(index+1, str.length());
    } else {
            return str;
        }
    }
}
