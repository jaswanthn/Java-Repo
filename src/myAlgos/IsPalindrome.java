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

    public static void main(String[] args) {
       // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("rashmi[]^_` "));

    }
}
