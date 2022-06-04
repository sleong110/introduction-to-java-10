package ch02;

import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");

        double monthlySaving = input.nextDouble();
        
        final double interestRate = 0.00417;
        double totalSavings = 0;
        for (int i = 0; i < 6; i ++) {
            totalSavings = (monthlySaving + totalSavings) * (1 + 0.00417);
        }

        System.out.printf("After the sixth month, the account valud is %.2f", totalSavings);
    }
}