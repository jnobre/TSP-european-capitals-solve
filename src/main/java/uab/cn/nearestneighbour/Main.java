package uab.cn.nearestneighbour;

public class Main {

    public static int[][] readInput(String fileString) {
        int[][] distanceMatrix = new int[10000 + 1][10000 + 1];
        for (int[] row : distanceMatrix) java.util.Arrays.fill(row, 10000);
        distanceMatrix[0][0] = 1;
        for (int i = 1; i <= 10000; i++)
        {
            for (int j = 1; j <= 10000; j++)
            {
                if (i == j)
                {
                    distanceMatrix[i][j] = 1;
                }
            }
        }
/*
        for (int i = 0 ; i < distanceMatrix.length ; i++) {
            for (int j = 0 ; j < distanceMatrix[i].length ; j++) {
                System.out.print(distanceMatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
*/
        return distanceMatrix;
    }

    public static void main(String[] args) {
        int adjCitiesDistance[][];

        System.out.println("*** Problema 1 - Capitais de distrito Portuguesas ***");
        adjCitiesDistance = readInput("teste");
        long start2 = System.currentTimeMillis();
        NearestNeighbour nearestNeighbour = new NearestNeighbour();
        nearestNeighbour.tsp(adjCitiesDistance);
        long end2 = System.currentTimeMillis();
        System.out.println("\n[Problem 1] Elapsed Time in milli seconds: "+ (end2-start2));
        System.out.println("\n*****************************************************");

        System.out.println("*** Problema 2 - Capitais Europeias ***");
        System.out.println("TODO");
        System.out.println("\n****************************************");
    }
}
