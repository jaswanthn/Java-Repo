package collections1;

import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("Kiran");
        ts.add("Anand");
        ts.add("Nani");
        ts.add("Murthy");

        System.out.println(ts);

    }



}

class MyComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        return o2.toString().compareTo(o1.toString());
    }
}

