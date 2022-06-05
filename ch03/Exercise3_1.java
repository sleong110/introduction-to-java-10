package ch03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        if (r1 - r2 > 0 ) { 
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (r1 - r2 == 0) {
            System.out.println("The equation has only one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
        
}