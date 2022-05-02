package uab.cn;

import uab.cn.genetic.GeneticAlgorithm;
import uab.cn.nearestneighbour.NearestNeighbour;
import uab.cn.utils.Utils;

import java.util.Scanner;

public class Main {
    private static final String GENETIC_PORTUGAL_CITIES = "1 - Genetic Algorithm Portugal Cities";
    private static final String GENETIC_EUROPEAN_CAPITALS = "2 - Genetic Algorithm European Capitals";

    private static final String NON_GENETIC_PORTUGAL_CITIES = "3 - Non Genetic Algorithm Portugal Cities";
    private static final String NON_GENETIC_EUROPEAN_CAPITALS = "4 - Non Genetic Algorithm European Capitals";
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    private static String selectOption() {
        System.out.println(GENETIC_PORTUGAL_CITIES);
        System.out.println(GENETIC_EUROPEAN_CAPITALS);
        System.out.println(NON_GENETIC_PORTUGAL_CITIES);
        System.out.println(NON_GENETIC_EUROPEAN_CAPITALS);
        System.out.println("5 - Exit");
        return input.next();
    }

    public static void start() {
        while(true) {
            String option = selectOption();
            switch (option) {
                case "1":
                    executeGeneticAlgorithm(Utils.citiesPortugal, GENETIC_PORTUGAL_CITIES, Utils.portugueseCapitalsLabels);
                    break;
                case "2":
                    executeGeneticAlgorithm(Utils.europeanCapitals, GENETIC_EUROPEAN_CAPITALS, Utils.europeanCapitalsLabels);
                    break;
                case "3":
                    executeNonGeneticAlgorithm(Utils.citiesPortugal, NON_GENETIC_PORTUGAL_CITIES, Utils.portugueseCapitalsLabels);
                    break;
                case "4":
                    executeNonGeneticAlgorithm(Utils.europeanCapitals, NON_GENETIC_EUROPEAN_CAPITALS, Utils.europeanCapitalsLabels);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option! Please select a new option.");
                    break;
            }
        }
    }

    private static void executeGeneticAlgorithm(double[][] cities, String problemName, String[] labels) {
        System.out.printf("*** Problem : %s - Start ***\n", problemName);
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(cities, 0);
        long elapsedTime = geneticAlgorithm.optimize();
        System.out.printf("\nElapsed Time in milli seconds: %d\n",  elapsedTime);
        System.out.printf("*** Problem : %s - End ***\n", problemName);
        System.out.println("Path: " + Utils.print(geneticAlgorithm.getSolution(), labels));
        System.out.println("*****************************************************\n");
    }

    private static void executeNonGeneticAlgorithm(double[][] cities, String problemName, String[] labels) {
        System.out.printf("*** Problem : %s - Start ***\n", problemName);
        long start2 = System.nanoTime();
        NearestNeighbour nearestNeighbour = new NearestNeighbour();
        nearestNeighbour.tsp(cities);
        long end2 = System.nanoTime();
        System.out.printf("\nElapsed Time in nano seconds: %d\n",  end2-start2);
        System.out.printf("*** Problem : %s - End ***\n", problemName);
        System.out.println("Path: " + Utils.print(nearestNeighbour.getSolution(), labels));
        System.out.println("*****************************************************\n");
    }
}