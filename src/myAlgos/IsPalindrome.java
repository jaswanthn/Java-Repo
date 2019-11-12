package myAlgos;

public class IsPalindrome {

    public static int isPalindrome(String str) {


        // synthesize string
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                    sb.append(str.charAt(i));
            }
        }

        str = sb.toString().toLowerCase();

        //System.out.println(str);

        for (int k = 0; k < str.length()/2; k++) {
            if (str.charAt(k) != str.charAt(str.length() - k - 1)) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean isPalindromeNew(String s) {

        if (s.length()==0) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        // synthesize the input array
        for (int i=0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(i)) {
                sb.append(s.charAt(i));
            }
        }

        String temp = sb.toString();

        // check if this is palindrome
        for (int j = 0; j < temp.length()/2; j++) {
            System.out.println(temp);
            if (temp.charAt(j) != temp.charAt(temp.length() - 1 - j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
       // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("rashmi[]^_` "));
        System.out.println(isPalindromeNew("race a car"));

    }
}
