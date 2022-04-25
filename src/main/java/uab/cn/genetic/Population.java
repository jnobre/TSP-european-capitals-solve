package uab.cn.genetic;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class Population {
    private List<Chromosome> chromosomes;
    private int numberOfCities;
    private double[][] distances;
    private int startingCity;

    public static Population buildInitialPopulation(int populationSize, int numberOfCities, double[][] distances, int startingCity) {
        List<Chromosome> chromosomes = initializePopulation(populationSize, numberOfCities, distances, startingCity);
        return new Population(chromosomes, numberOfCities, distances, startingCity);
    }

    private static List<Chromosome> initializePopulation(int populationSize, int numberOfCities, double[][] distances, int startingCity) {
        List<Chromosome> population = new ArrayList<>();

        for(int i = 0; i < populationSize; i++) {
            population.add(Chromosome.buildRandomGenome(numberOfCities, distances, startingCity));
        }

        return population;
    }

    public Chromosome getBestChromosome() {
        return Collections.min(chromosomes);
    }

    public void generateNewPopulation() {
        ArrayList<Chromosome> generation = new ArrayList<>();

        // Get best chromosome
        Collections.sort(this.chromosomes);
        generation.add(this.chromosomes.get(0));

        // Crossover between the two best chromosomes
        generation.addAll(this.crossover(this.chromosomes.get(0), this.chromosomes.get(1)));

        // Get two random chromosomes and apply crossover
        generation.addAll(applyCrossoverRandomParents());

        // New population
        this.chromosomes = generation;
    }

    private ArrayList<Chromosome> applyCrossoverRandomParents() {
        Random rand = new Random();
        int size = this.chromosomes.size();

        int father = rand.nextInt( size - 1) + 1;
        int mother = rand.nextInt(size - 1) + 1;
        while (mother == father) {
            mother = rand.nextInt(size - 1) + 1;
        }

        return this.crossover(this.chromosomes.get(father), this.chromosomes.get(mother));
    }

    private ArrayList<Chromosome> crossover(Chromosome father, Chromosome mother) {

        ArrayList<Chromosome> retorno = new ArrayList<>();
        List<Integer> fatherGens = father.getGens();
        List<Integer> motherGens = mother.getGens();

        // First son: father first part and mother second part
        List<Integer> firstSonGens = this.generateSonGens(fatherGens, motherGens);

        // Second son: mother first part and father second part
        List<Integer> secondSonGens = this.generateSonGens(motherGens, fatherGens);

        // Faz mutacao trocando dois pontos randomicos
        Random rand = new Random();
        int mutationPosition1 = rand.nextInt(fatherGens.size());
        int mutationPosition2 = rand.nextInt(fatherGens.size());
        while (mutationPosition1 == mutationPosition2) {
            mutationPosition2 = rand.nextInt(fatherGens.size());
        }

        this.changePositions(firstSonGens, mutationPosition1, mutationPosition2);
        this.changePositions(secondSonGens, mutationPosition1, mutationPosition2);

        retorno.add(new Chromosome(firstSonGens, numberOfCities, distances, startingCity));
        retorno.add(new Chromosome(secondSonGens, numberOfCities, distances, startingCity));

        return retorno;
    }

    private List<Integer> generateSonGens(List<Integer> firstParentGens, List<Integer> secondParentGens) {
        List<Integer> gens = new ArrayList<>(firstParentGens.subList(0, firstParentGens.size() / 2));
        for(Integer gen : secondParentGens) {
            if (!gens.contains(gen)) {
                gens.add(gen);
            }
        }

        return gens;
    }

    private void changePositions(List<Integer> gens, int mutationPosition1, int mutationPosition2) {
        Integer firstGen = gens.get(mutationPosition1);
        Integer secondGen = gens.get(mutationPosition2);

        gens.set(mutationPosition1, secondGen);
        gens.set(mutationPosition2, firstGen);
    }
}