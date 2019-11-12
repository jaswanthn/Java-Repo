package myAlgos;

import java.util.Stack;

public class BracesMatching {
    public static void main(String[] args) {

    }

    public static String[] braces(String[] values) {

        String[] resultSet = new String[values.length];


        for (int k = 0; k < values.length; k++ ) {
            resultSet[k] = bracesTest(values[k]);
        }

        return resultSet;

        }

    static String bracesTest(String str) {

        if (str.isEmpty()) {
            return "YES";
        }

        if (str.length() == 1) {
            return "NO";
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            }


            if (curr == '}' || curr == ')' || curr == ']') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char last = stack.peek();
                if (curr == '}' && last == '{' || curr == ')' && last == '(' || curr == ']' && last == '[')
                    stack.pop();
                else {
                    return "NO";
                }
            }
        }

        String result;

        return result = stack.isEmpty() ? "YES" : "NO";

    }
}


