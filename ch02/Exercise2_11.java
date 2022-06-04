package ch02;

import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");

        int numberOfYears = input.nextInt();
        int currentPopulation = 312032486;
        int numberOfSecondsPerYear = 365 * 24 * 60 * 60;
        double numberOfBirthRatePerYear = numberOfSecondsPerYear / 7.0;
        double numberOfDeathRatePerYear = numberOfSecondsPerYear / 13.0;
        double numberOfImmigrationRatePerYear = numberOfSecondsPerYear / 45.0;

        int totalPopulationAfterXYears = currentPopulation + (int)Math.round(numberOfYears * ( numberOfBirthRatePerYear - numberOfDeathRatePerYear + numberOfImmigrationRatePerYear));  
        System.out.println("The population in " + numberOfYears + " is " + totalPopulationAfterXYears);
    }
}