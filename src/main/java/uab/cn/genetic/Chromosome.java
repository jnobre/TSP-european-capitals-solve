package uab.cn.genetic;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class Chromosome implements Comparable<Chromosome> {
    private List<Integer> gens;
    private int startingCity;
    private double fitness;

    public static Chromosome buildRandomGenome(int numberOfCities, double[][] distances, int startingCity) {
        return new Chromosome(
            generateRandomPath(numberOfCities, startingCity),
            numberOfCities,
            distances,
            startingCity);
    }

    private static List<Integer> generateRandomPath(int numberOfCities, int startingCity) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < numberOfCities; i++) {
            if(i != startingCity) {
                result.add(i);
            }
        }

        Collections.shuffle(result);

        return result;
    }

    public Chromosome(List<Integer> permutationOfCities, int numberOfCities, double[][] distances, int startingCity){
        this.startingCity = startingCity;
        this.gens = permutationOfCities;
        this.fitness = calculateFitness(distances, numberOfCities);
    }

    private double calculateFitness(double[][] distances, int numberOfCities) {
        int currentCity = startingCity;
        BigDecimal fitness = BigDecimal.ZERO;

        for(int gene : gens) {
            fitness = fitness.add(BigDecimal.valueOf(distances[currentCity][gene]));
            currentCity = gene;
        }

        fitness = fitness.add(BigDecimal.valueOf(distances[gens.get(numberOfCities - 2)][startingCity]));

        return fitness.doubleValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path: ");
        sb.append(startingCity);

        gens.forEach(gene -> {
            sb.append(" ");
            sb.append(gene);
        });

        sb.append(" ");
        sb.append(startingCity);

        sb.append("\nFitness: ");
        sb.append(this.fitness);

        return sb.toString();
    }

    @Override
    public int compareTo(Chromosome chromosome) {
        return Double.compare(this.fitness, chromosome.fitness);
    }
}