package staticexample;

import java.util.Scanner;

public class Bottle {

    public static double bottleLevel = 0;

    static final double maxCapacity = 1000;

    void fillBottle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water you want to fill");
        double amountOfWaterToFill = sc.nextDouble();
        if ((bottleLevel + amountOfWaterToFill) <= maxCapacity) {
            bottleLevel += amountOfWaterToFill;
            System.out.println("Bottle level: " + bottleLevel);
        } else {
            System.out.println("cannot fill more than the bottle level, " +
                    "Please fill below capacity: " + (maxCapacity - bottleLevel));

        }
    }

    void emptyBottle() {
        bottleLevel = 0;
        System.out.println("Bottle is emptied and the bottle level is: " + bottleLevel );
    }

    void sipWater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water you want to sip");
        double amountOfWaterToSip = sc.nextDouble();
        if (amountOfWaterToSip <= bottleLevel) {
            bottleLevel -= amountOfWaterToSip;
            System.out.println("Bottle level: " + bottleLevel);
        } else {
            System.out.println("You cannot sip more than available");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bottle bt = new Bottle();

        while(true) {

            System.out.println("Enter your choice \n1. fillBottle \n2. emptyBottle \n3. sipWater \n4. exit");

            int userInput = sc.nextInt();

            switch (userInput) {

                case 1:
                    bt.fillBottle();
                    break;

                case 2:
                    bt.emptyBottle();
                    break;

                case 3:
                    bt.sipWater();
                    break;
                // why we need to pass argument as 0 here?
                case 4: System.exit(0);

                default:
                    System.out.println("Pls select valid option");
                    break;
            }
        }
    }
}
