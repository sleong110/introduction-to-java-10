package ch02;

import java.util.Scanner;

public class Exercise2_12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and accelaration: ");

        double v = input.nextDouble();
        double a = input.nextDouble();

        double l = Math.pow(v, 2) / (2 * a);

        System.out.printf("The minimum runway length for this airplane is %.3f", l);
    }
}