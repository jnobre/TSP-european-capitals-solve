package uab.cn.nearestneighbour;

import java.util.Stack;

public class NearestNeighbour {

    private final Stack<Integer> stack;

    public NearestNeighbour() {
        stack = new Stack<>();
    }

    public void tsp(double adjCitiesDistance[][]) {
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
    }
}
