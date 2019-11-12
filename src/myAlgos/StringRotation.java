package myAlgos;

public class StringRotation {

    public static void main(String[] args) {
        isStringRotated("waterbottle", "erbottlewat");
    }

    public static void isStringRotated(String str1, String str2) {
        // can we break string to x and y such that
        // xy = 'waterbottle' and yx = 'erbottlewat'
        // where x = wat y = erbottle
        // now xyxy contains yx in it hence str2 is a substring of str1str1

        if (str1.length() > 0 && str2.length() == str1.length()) {
            String str1str1 = str1 + str1;
            if (str1str1.contains(str2)) {
                System.out.println("is rotated substring");
            } else {
                System.out.println("is not rotated substring");
            }
        }
    }
}
