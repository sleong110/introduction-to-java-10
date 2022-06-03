package ch02;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int value = input.nextInt();

        int sum = 0;
        while (value > 0) {
            // extract the last digit from input value and add assign to sum variable
            sum += (value % 10);
            // integer value divide by 10 and assign to value again
            value /= 10;
        }

      System.out.println("The sum of the digits is " + sum);
    }
}