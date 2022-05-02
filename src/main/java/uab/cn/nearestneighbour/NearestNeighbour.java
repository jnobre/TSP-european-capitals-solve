package uab.cn.nearestneighbour;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestNeighbour {

    private final Stack<Integer> stack;
    private List<Integer> solution = new ArrayList<>();

    public NearestNeighbour() {
        stack = new Stack<>();
    }

    public List<Integer> tsp(double adjCitiesDistance[][]) {
        int nNodes = adjCitiesDistance[1].length - 1;
        int[] visited = new int[nNodes + 1];
        visited[0] = 1;
        stack.push(0);
        int element, dst = 0, i, totalDst = 0, lastElement = 0;
        double min = Double.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(0 + "\t");


        while (!stack.isEmpty()) {
            element = stack.peek();
            i = 1;
            min = Double.MAX_VALUE;
            while (i <= nNodes) {
                if (adjCitiesDistance[element][i] > 1 && visited[i] == 0) {
                    if (min > adjCitiesDistance[element][i]) {
                            min = adjCitiesDistance[element][i];
                            dst = i;
                            minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag) {
                visited[dst] = 1;
                stack.push(dst);
                solution.add(dst);
                System.out.print(dst + "\t");
                minFlag = false;
                totalDst += min;
                lastElement = dst;
                continue;
            }
            stack.pop();
        }

        totalDst += adjCitiesDistance[lastElement][0];
        System.out.println("\nTotal travaled: " + totalDst);

        return solution;
    }

    public List<Integer> getSolution() {
        return solution;
    }
}
