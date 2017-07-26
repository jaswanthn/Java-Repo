public class RecursionTypes {

    private int test = 0;

    // nth fibonocci number
    public static int fibonocci(int i) {
        if (i == 0) {

            return  0;

        } else if (i == 1) {

            return 1;
        }

            return fibonocci(i-1) + fibonocci(i-2);

    }

}
