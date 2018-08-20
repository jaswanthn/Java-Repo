package myAlgos;

import java.util.*;

class Interval {
     int start;
     int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class NonOverlappingIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        // check for merge intervals and replace

        // check if current interval merge with any existing intervals

        // let us take hashset
        LinkedHashSet<Interval> hs = new LinkedHashSet<>();

        Iterator<Interval> it = intervals.iterator();

        while(it.hasNext()) {

            Interval curr = it.next();

            System.out.println(curr.start + ":" + curr.end);
            // check if one overlaps with other
            if (Math.max(curr.start, newInterval.start) < Math.min(curr.end, newInterval.end)) {

                // add to hashset
                hs.add(curr);
                // remove from arraylist
                it.remove();
            }

        }

        // replace hashset

        // result of mixed interval

        Interval res = new Interval();

        if (hs.isEmpty()) {
            res.start = Math.min(newInterval.start, newInterval.end);
            res.end = Math.max(newInterval.end, newInterval.start);
        } else {
            res.start = Integer.MAX_VALUE;
            res.end = Integer.MIN_VALUE;
        }

        for (Interval it2 : hs) {
            res.start = Math.min(res.start, Math.min(it2.start, newInterval.start));
            res.end = Math.max(res.end, Math.max(it2.end, newInterval.end));
        }

        intervals.add(res);

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        return intervals;

    }

    public static void main(String[] args) {
        Interval it1 = new Interval(1, 3);
        Interval it2 = new Interval(6,9);
        Interval it3 = new Interval(17,19);



        ArrayList<Interval> al = new ArrayList<Interval>();
        al.add(it2);
        al.add(it1);
        al.add(it3);


        NonOverlappingIntervals no = new NonOverlappingIntervals();
        ArrayList<Interval> al1 = no.insert(al, new Interval(7,16));

        for (Interval a: al1) {
            System.out.println(a.start  + " :" + a.end);
        }
    }
}