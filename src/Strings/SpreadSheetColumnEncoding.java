package Strings;

public class SpreadSheetColumnEncoding {

    public static void main(String[] args) {

        SpreadSheetColumnEncoding sscEncoding = new SpreadSheetColumnEncoding();
        System.out.println(sscEncoding.decodeColumnString("AAA"));
        String str = "hello";
        System.out.println(str.hashCode() % 10);
    }

    public static int decodeColumnString(String columnString) {

        if (columnString == null || columnString.length() < 1) {
            throw new IllegalArgumentException("enter valid string");
        }

        int result = 0;

        for(char c : columnString.toCharArray()) {
            result = (result * 26) + c - 'A' + 1;
        }

        return result;

    }
}
