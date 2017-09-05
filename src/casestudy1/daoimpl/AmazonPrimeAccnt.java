package casestudy1.daoimpl;

import java.util.Scanner;

public class AmazonPrimeAccnt extends Amazon{

    Scanner sc = new Scanner(System.in);
    @Override
    public void payment() {
        System.out.println("Please select from your available payment options \n " +
                "1. Credit Card 2. Debit Card 3. COD 4. Amazon Gift Card 5. Exit");
        switch (sc.nextInt()) {
            case 1: creditPaymentGateway();
                    break;

            case 2: debitPaymentGateway();
                    break;

            case 3: cashOnDelivery();
                    break;

            case 4: giftCard();
                    break;

            case 5: System.exit(0);

            default:
                System.out.println("Please enter valid option");
                break;

        }

    }

    public void addPaymentMethod() {

    }

    public void editPaymentMethod() {

    }

    private void giftCard() {
        System.out.println("Gift card redeemed. Thanks for choosing amazon prime");
    }

    private void creditPaymentGateway() {
        System.out.println("You entered credit payment gateway");
    }

    private void debitPaymentGateway() {
        System.out.println("You entered debit payment gateway");
    }

    private void cashOnDelivery() {
        System.out.println("You selected cash on delivery. Thanks for choosing Amazon Prime");
    }
}
