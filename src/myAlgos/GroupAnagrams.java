package myAlgos;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagrams implements Comparator<String> {

    public String sortChars(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public int compare(String str1, String str2) {
        return sortChars(str1).compareTo(sortChars(str2));
    }

    public void groupAnags(String[] strArr) {
        Arrays.sort(strArr, new GroupAnagrams());
        for (String str: strArr) {
            System.out.println(str);
        }
    }

    // unit test
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        ga.groupAnags(new String[]{"abc", "efg", "bca", "dnm", "cab"});
    }
}
