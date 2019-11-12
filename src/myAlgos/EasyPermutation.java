package myAlgos;

import java.util.ArrayList;
import java.util.*;

public class EasyPermutation {

    public static void permutation(String prefix, String str) {
        int n = str.length();

        if (str.length()<=0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n));
        }
    }

    public static List<String> otherPermutation(String str){
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[str.length()];

        premRec(str, "", used, result);

        return result;
    }

    private static void premRec(String str,String current, boolean[] used, List<String> result){
        if(current.length() == str.length()){
            result.add(current);
            System.out.println(current);
            return;
        }

        for(int i=0; i <  str.length(); i++){
            if(used[i]) continue;
            used[i] = true;
            premRec(str, current + str.charAt(i), used, result);
            used[i] = false;
        }
    }
    public static void main(String[] args) {


        //permutation("", "ABC");
        otherPermutation("ABCD");
    }

    List<Integer> lengthEachScene(List<Character> inputList){

        List<Integer> result = new ArrayList<Integer>();

        int lastIndex = 0;

        HashSet<Character> tempPar  = new HashSet<Character>();

        for(int i = 0; i < inputList.size(); i++){

            for(int j = i; j < inputList.size(); j++){
                if(tempPar.contains(inputList.get(j))){
                    lastIndex = j;
                }
                else{
                    tempPar.add(inputList.get(j));
                }
            }
            result.add(lastIndex + 1);
            i = lastIndex;
            tempPar.clear();
        }

        return result;
    }
}
