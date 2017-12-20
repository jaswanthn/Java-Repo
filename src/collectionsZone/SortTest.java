package collectionsZone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(13);
        li.add(15);
        li.add(9);

        li.sort(new Comparator<Integer>(){public int compare(Integer a,Integer b) {
             return (a < b) ? -1 : 1;
        }});

        System.out.println(li);

        Integer it = new Integer(10);
        System.out.println(it.compareTo(13));

    }
}
