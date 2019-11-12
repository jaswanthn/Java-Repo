package myAlgos;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        System.out.println(Character.isLetter('1'));

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

        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> z = new ArrayList<>(Arrays.asList(9,10,11,12));

        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        A.add(x);
        A.add(y);
        A.add(z);
        ArrayList<ArrayList<Integer>> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }

        Set<String> st = new HashSet<String>();
        st.add("first");
        st.add("second");
        st.add("third");
        st.add("fourth");
        st.add(null);
        st.add(null);

        Iterator<String> it = st.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
//

//        Map<String, Integer> mp = new HashMap<String, Integer>();
//
//        mp.put("hello", 1);
//        mp.put("hi", 2);
//
//       for (Map.Entry me : mp.entrySet()) {
//
//       }
//
//       for (String str: mp.keySet()) {
//
//       }
//
//       for (int x : mp.values()) {
//
//       }
//
//       Set st = mp.entrySet();
//
//        Iterator it = st.iterator();
//
//        LinkedList l = new LinkedList();
//

        System.out.println(Main.checkSum(new int[]{3, 1, 7, 11}, 12));

        System.out.println(5 + "this");

        System.out.println(Integer.valueOf('c'));

    }

    public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

    public static boolean checkSum(int[] arr, int target) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], target - arr[i]);
            if (hm.containsKey(target - arr[i]) && arr[i] != target - arr[i])  {
                System.out.println("two array elements are:  " + arr[i] + ", " + hm.get(arr[i]));
                return true;
            }
        }

        return false;
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
