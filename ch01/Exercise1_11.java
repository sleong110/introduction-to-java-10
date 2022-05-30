package ch01;

public class Exercise1_11 {
    public static void main(String[] args) {
        int numberOfSecondsInOneYear = 365 * 24 * 60 * 60;
        double numberOfBirthInOneYear = numberOfSecondsInOneYear / 7.0;
        double numberOfDeathInOneYear = numberOfSecondsInOneYear / 13.0;
        double numberOfNewImmigrantInOneYear = numberOfSecondsInOneYear / 45.0;
        int currentPopulation = 312032486;
        double numberOfProjectedPopulationInFiveYears = currentPopulation + 5 * (numberOfBirthInOneYear - numberOfDeathInOneYear + numberOfNewImmigrantInOneYear);
        System.out.println("Projected population in 5 years: ");
        System.out.println(numberOfProjectedPopulationInFiveYears);
    }
}