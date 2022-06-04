package ch02;

import java.util.Scanner;

public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest is %.5f", interest);
    }
}