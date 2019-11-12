package myAlgos;

public class CheckXPowY {

    public static boolean checkIfXPowY(int x) {
        // start with factor 2 and increment
        int factor = 2;
        int temp = x;
        while (factor <= Math.sqrt(x)) {

            while (temp % factor == 0) {
                temp = temp / factor;
                if (temp == 1) {
                    return true;
                }
            }

            factor += 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfXPowY(17));
    }

}
