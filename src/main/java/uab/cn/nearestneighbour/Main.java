package uab.cn.nearestneighbour;

import uab.cn.utils.Utils;

public class Main {

    public static void main(String[] args) {
        //Utils.generateMatrixAdj();

        System.out.println("*** Problema 1 - Capitais de distrito Portuguesas ***");
        long start2 = System.nanoTime();
        NearestNeighbour nearestNeighbour = new NearestNeighbour();
        nearestNeighbour.tsp(Utils.europeanCapitalsPortugal);
        long end2 = System.nanoTime();
        System.out.println("\n[Problem 1] Elapsed Time in milli seconds: "+ (end2-start2));
        System.out.println("\n*****************************************************");


    }
}
