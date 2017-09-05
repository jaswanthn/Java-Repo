package casestudy1.controller;

import casestudy1.daoimpl.AmazonPrimeAccnt;

import java.util.Scanner;

public class PrimeUser {

    public static void main(String[] args) {
        AmazonPrimeAccnt amzn = new AmazonPrimeAccnt();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Amazon Prime Account ");
        System.out.println("--------------------------------");

        while (true) {
            System.out.println("Select your choice \n1. Add Items 2. View Items 3. Search Item Price 4. Payment 5. Exit");

            switch (sc.nextInt()) {
                case 1:
                    amzn.addItems();
                    break;

                case 2:
                    amzn.viewItems();
                    break;

                case 3:
                    amzn.searchItemPrice();
                    break;

                case 4:
                    amzn.payment();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Please enter valid input");
                    break;

            }

        }
    }

}
