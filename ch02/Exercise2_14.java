package ch02;

import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        double BMI = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.printf("BMI is %.4f", BMI);
    }
}