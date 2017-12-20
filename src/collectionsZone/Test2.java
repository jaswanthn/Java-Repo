package collectionsZone;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        Test1 test = new Test1();
        // test to save data
        test.arrayListPerfTest();
        test.vectorPerfTest();
        test.hashMapPerfTest();
        test.treeMapPerfTest();
        // test to retrieve data
        test.arrayListRetrievalPerf();
        test.vectorRetrievalPerf();
        test.hashMapRetrievalPerf();
        test.treeMapRetrievalPerf();


        String str = "myName";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int s = String.valueOf(6).length();
        System.out.println(s);
    }

}
