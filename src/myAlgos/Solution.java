package myAlgos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
class Interval {
    int start;
    int end;
    char value;

    Interval(char value, int start){
        this.value = value;
        this.start = start;
        this.end = start;
    }

    public String toString(){

        return value +"["+start+":"+end+"]";
    }
}

public class Solution {

    public static void main(String[] args) {
        Solution ml = new Solution();
        System.out.println("Result");
        System.out.println(ml.lengthEachScene(new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'e', 'a', 'e', 'f', 'g', 'h', 'i', 'j', 'e'))));
        System.out.println("Result");
        System.out.println(ml.lengthEachScene(new ArrayList<Character>(Arrays.asList('a','b','a','b','c','b','a','c','a','d','e','f','e','g','d','e','h','i','j','h','k','l','i','j'))));
        System.out.println("Result");
        System.out.println(ml.lengthEachScene(new ArrayList<Character>(Arrays.asList('a', 'b', 'c','a'))));
        System.out.println("Result");
        System.out.println(ml.lengthEachScene(new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'a', 'e', 'f', 'g', 'h', 'i', 'j', 'e'))));

    }

    List<Integer> lengthEachScene(List<Character> inputList){

        List<Integer> result = new ArrayList<>();
        Map<Character, Interval> occuranceMap = new LinkedHashMap<>();

        List<Interval> l = new ArrayList<>();
        for(int i = 0; i < inputList.size(); i++){
            char cur = inputList.get(i);
            if(occuranceMap.containsKey(cur)){
                occuranceMap.get(cur).end = i;
            }
            else{
                occuranceMap.put(cur, new Interval(cur, i));
            }
        }

        List<Interval> listP = new ArrayList<Interval>(occuranceMap.values());

        System.out.println(listP);
        Interval prev = listP.get(0);

        for(int i = 1; i < listP.size(); i++){

            Interval cur = listP.get(i);
            if( prev.end < cur.start ){

                result.add(prev.end - prev.start +1);
                prev.start = cur.start;
                prev.end = cur.end;
            }
            else{
                if(prev.end > cur.end){
                    continue;
                }
                else{
                    prev.end = cur.end;

                }

            }

        }

        result.add(prev.end - prev.start + 1);

        return result;
    }
}