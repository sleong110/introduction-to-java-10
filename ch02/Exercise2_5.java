package ch02;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter subtotal and gratuity rate: ");

        int subtotal = input.nextInt();
        double gratuity = (double) input.nextInt() / 100 * 10;

        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " total is $" + total);
    }
}