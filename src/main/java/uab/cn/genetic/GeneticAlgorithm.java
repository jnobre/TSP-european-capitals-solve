package uab.cn.genetic;

public class GeneticAlgorithm {

    // Control Variables
    private static final int POPULATION_SIZE = 5000; // Initial population size
    private static final int MAX_ITERATIONS_WITHOUT_IMPROVEMENTS = Integer.MAX_VALUE;
    private static final long TIME_LIMIT = 60000L; // 1 minute

    // Attributes
    private final double[][] distances;
    private final int startingCity;
    private Chromosome bestChromosome = null;

    public GeneticAlgorithm(double[][] distances, int startingCity) {
        this.distances = distances;
        this.startingCity = startingCity;
    }

    public long optimize() {
        long start = System.currentTimeMillis();

        Population population = this.initializePopulation();

        int counter = 1;
        double bestFitness = Double.MAX_VALUE;
        int iterationsWithoutImprovements = 0;


        while((System.currentTimeMillis() - start) < TIME_LIMIT) {
            bestChromosome = population.getBestChromosome();
            double fitness = bestChromosome.getFitness();

            if (fitness < bestFitness) {
                System.out.println("\nGeneration: " + counter);
                System.out.println(bestChromosome);
                bestFitness = fitness;
                iterationsWithoutImprovements = 0;
            } else {
                iterationsWithoutImprovements++;
            }

            if(iterationsWithoutImprovements >= MAX_ITERATIONS_WITHOUT_IMPROVEMENTS) {
                break;
            }

            population.generateNewPopulation();
            counter++;
        }

        System.out.printf("\nTotal of generations: %d\n", counter);
        long end = System.currentTimeMillis();
        return (end - start);
    }

    private Population initializePopulation() {
        return Population.buildInitialPopulation(POPULATION_SIZE, distances.length, distances, startingCity);
    }

    public Chromosome getSolution() {
        return this.bestChromosome;
    }
}