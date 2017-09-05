package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo1 {

    public static void main(String[] args) {

        saveFromUser();

    }

    private static void saveFromUser() {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers to add");
        for (int j =0; j < 10; j++) {
            try {
                int input = sc.nextInt();
                arr[j] = input;
            } catch(InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("Pls enter only integer type");
                sc.next();
                j--;
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        }

        add(arr);
    }

    private static void add(int a[]) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("Sum of the input numbers: " + sum);
    }
}
