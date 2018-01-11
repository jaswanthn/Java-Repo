package myAlgos;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        // hashmap initiation and iterations

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("name1", 1);
        hm.put("name2", 2);
        hm.put("name3", 3);

        // method 1 to iterate through each key and fetch value using get
        for (String str: hm.keySet()) {
            System.out.println(str + " " + hm.get(str));
        }

        // method 2 to iterate use Map.Entry, here Map.Entry is an interface
        for (Map.Entry mp : hm.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

        // method 3 is using iterator()
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
