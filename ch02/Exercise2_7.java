package ch02;

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        int minutesInput = input.nextInt();

        // Number of minutes in a day
        int numberOfMinutesPerDay = 24 * 60;
        int numberOfMinutesPerYear = 365 * numberOfMinutesPerDay;


        int numberOfDays = (minutesInput % numberOfMinutesPerYear) / numberOfMinutesPerDay;
        int numberOfYears = minutesInput / numberOfMinutesPerYear;

        System.out.println(minutesInput + " minutes is approximately " + numberOfYears + " years and " + numberOfDays + " days");

    }
}