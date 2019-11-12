package myAlgos;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int A) {

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i < A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                // if it is first element or last element set to zero
                if (j==0 || j==i) {
                    temp.add(1);
                } else {
                    temp.add(arrList.get(i-1).get(j-1) + arrList.get(i-1).get(j));
                }
            }

            arrList.add(temp);
        }


        return arrList;
    }

    public static void main(String[] args) {

        PascalTriangle ps = new PascalTriangle();

    }
}

