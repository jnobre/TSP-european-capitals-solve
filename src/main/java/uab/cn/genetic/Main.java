package uab.cn.genetic;

import uab.cn.utils.Utils;

import java.util.Scanner;

public class Main {
    private static final String GENETIC_PORTUGAL_CITIES = "1 - Genetic Algorithm Portugal Cities";
    private static final String GENETIC_EUROPEAN_CAPITALS = "2 - Genetic Algorithm European Capitals";
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    private static String selectOption() {
        System.out.println(GENETIC_PORTUGAL_CITIES);
        System.out.println(GENETIC_EUROPEAN_CAPITALS);
        System.out.println("3 - Exit");
        return input.next();
    }

    public static void start() {
        while(true) {
            String option = selectOption();
            switch (option) {
                case "1":
                    executeGeneticAlgorithm(Utils.citiesPortugal, GENETIC_PORTUGAL_CITIES);
                    break;
                case "2":
                    executeGeneticAlgorithm(Utils.europeanCapitalsPortugal, GENETIC_EUROPEAN_CAPITALS);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option! Please select a new option.");
                    break;
            }
        }
    }

    private static void executeGeneticAlgorithm(double[][] cities, String problemName) {
        System.out.printf("*** Problem : %s - Start ***\n", problemName);
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(cities, 0);
        long elapsedTime = geneticAlgorithm.optimize();
        System.out.printf("\nElapsed Time in milli seconds: %d\n",  elapsedTime);
        System.out.printf("*** Problem : %s - End ***\n", problemName);
        System.out.println("*****************************************************\n");
    }
}