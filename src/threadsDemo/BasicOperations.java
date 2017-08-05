package threadsDemo;

public class BasicOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        if (a <= b) {
            return b - a;

        } else {
            return a - b;

        }
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is zero");
        } else {
            return a/b;
        }
    }

    public void display(String result) {

        System.out.println(result);

    }

}
