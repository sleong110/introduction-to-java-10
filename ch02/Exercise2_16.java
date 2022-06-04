package ch02;

import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");

        double lengthOfSide = input.nextDouble();
        double areaOfHexagon = 3 * Math.sqrt(3) * Math.pow(lengthOfSide, 2) / 2;
        System.out.printf("The area of the hexagon is %.4f", areaOfHexagon);
    }
}