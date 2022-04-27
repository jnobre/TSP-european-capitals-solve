package uab.cn.nearestneighbour;

import java.util.Stack;

public class NearestNeighbour {

    private int nNodes;
    private Stack<Integer> stack;

    public NearestNeighbour() {
        stack = new Stack<Integer>();
    }

    public void tsp(double adjCitiesDistance[][]) {
        nNodes = adjCitiesDistance[1].length - 1;
        int[] visited = new int[nNodes + 1];
        visited[1] = 1;
        stack.push(1);
        int element, dst = 0 ,i;
        double min = Double.MAX_VALUE;
        boolean minFlag = false;
        int totalDst = 0;
        System.out.print(1 + "\t");

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
                continue;
            }
            stack.pop();
        }
        System.out.println("\nTotal percorrido: " + totalDst);
    }
}
