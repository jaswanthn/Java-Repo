package collectionsZone;

import java.util.*;

public class Test1 {

    List ls = new ArrayList();
    List vec = new Vector();
    Map hm = new HashMap();
    Map tm = new TreeMap();


    public void arrayListPerfTest() {

        long startTime = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) {
            ls.add(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Array List Insertion Time: " + (stopTime - startTime));
    }

    public void vectorPerfTest() {

        long startTime = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) {
            vec.add(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Vector Insertion Time: " + (stopTime - startTime));
    }

    public void hashMapPerfTest() {

        long startTime = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) {
            hm.put(i, i + 20);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("HashMap Insertion Time: " + (stopTime - startTime));
    }

    public void treeMapPerfTest() {

        long startTime = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) {
            tm.put(i, i + 10);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Tree Map Insertion Time: " + (stopTime - startTime));
    }

    public void arrayListRetrievalPerf() {

        long startTime = System.currentTimeMillis();
        Iterator it = ls.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Array List retreival Time: " + (stopTime - startTime));
    }

    public void vectorRetrievalPerf() {

        long startTime = System.currentTimeMillis();
        Iterator it = vec.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Vector retreival Time: " + (stopTime - startTime));
    }

    public void hashMapRetrievalPerf() {

        long startTime = System.currentTimeMillis();

        // using iterator to retrieve entries related to hash map
//        Iterator it = hm.entrySet().iterator();
//        while(it.hasNext()) {
//            Map.Entry mpEntry = (Map.Entry)it.next();
//            Object obj = mpEntry.getKey();
//        }
        for (Object mp : hm.keySet()) {
            Object value = hm.get(mp);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Hash Map retreival Time: " + (stopTime - startTime));
    }

    public void treeMapRetrievalPerf() {

        long startTime = System.currentTimeMillis();
        for (Object mp : tm.keySet()) {
            Object value = tm.get(mp);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Tree Map retreival Time: " + (stopTime - startTime));
    }
}
