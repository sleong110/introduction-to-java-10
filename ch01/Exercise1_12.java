package ch01;

public class Exercise1_12 {
    public static void main(String[] args) {
        double totalDistance = 24 * 1.6;
        double totalTimeInHour = 1 + (40 / 60.0) + (35 / 3600);
        double averageSpeedKilometerPerHour = totalDistance / totalTimeInHour;
        System.out.println("Average speed km/per: ");
        System.out.println(averageSpeedKilometerPerHour);
    }
}