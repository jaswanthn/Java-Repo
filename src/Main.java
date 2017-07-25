public class Main {

    public static void main(String[] args) {
        String myName = new String("jaswanth");
        System.out.println("Hello World!");
        //Main.Palindrome(new String("malalam"));
        System.out.println(Main.removeChar('j', myName));
    }

    public static void Palindrome(String x) {
        if (x != null && x.length() > 0) {
            if (x.equals(Main.reverseString(x))) {
                System.out.println(" this is a palindrome ");
            } else {
                System.out.println(" this is not a palindrome ");
            }
        } else {
            System.out.println(" please input a valid string ");
        }
    }


    private static String reverseString(String y) {
        String res = "";
        for (int i = 0; i < y.length(); i++ ) {
            res += y.charAt(y.length() - i -1);
        }
        return res;
    }

    private static String removeChar(char c, String str) {
        int index; boolean found = false;
        for (index = 0; index < str.length(); index++) {
            if (str.charAt(index) == c) {
                found = true;
                break;
            }
        }
        if (found) {
        return str.substring(0,index) + str.substring(index+1, str.length());
    } else {
            return str;
        }
    }
}
