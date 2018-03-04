package myAlgos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{

    public static void main(String[] args) {
        Solution ml = new Solution();
        System.out.println(ml.lengthEachScene(new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'a', 'e', 'f', 'g', 'h', 'i', 'j', 'e'))));
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<Integer> lengthEachScene(List<Character> inputList){

        List<Integer> result = new ArrayList<Integer>();

        int lastIndex = 0;

        HashSet<Character> tempPar  = new HashSet<Character>();

        //boolean common = false;

        for(int i = 0; i < inputList.size(); i++){

            for(int j = i; j < inputList.size(); j++){
                System.out.println(j);
                if(tempPar.contains(inputList.get(j))){
                    lastIndex = j;
                    break;
                }
                else{
                    //if (common) break;
                    tempPar.add(inputList.get(j));
                }
            }

            result.add(lastIndex + 1 );
            if (i < lastIndex)
            {
                i = lastIndex;
            }
            tempPar.clear();
        }

        return result;
    }
    // METHOD SIGNATURE ENDS
}