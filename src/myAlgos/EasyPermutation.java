package myAlgos;

public class EasyPermutation {

    public static void permutation(String prefix, String str) {
        int n = str.length();

        if (str.length()<=0) {
            System.out.println(prefix);
        }

        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n));
        }
    }

    public static void main(String[] args) {
        permutation("", "ABC");
    }
}