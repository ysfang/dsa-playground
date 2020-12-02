package graph;

public class GraphRepresentation {
    /*         2  - 0
     *        / \
     *       1 - 3
     * */

    // Edge List
    public static int[][] getEdgeList() {
        int[][] data = {{0, 2}, {1, 2}, {1, 3}, {2, 3}};
        return data;
    }

    // Adjacent List
    public static int[][] getAdjacentList() {
        int[][] data = {{2}, {2, 3}, {0, 1, 3}, {1, 2}};
        return data;
    }

    // Adjacent Matrix
    public static int[][] getAdjacentMatrix() {
        int[][] data = {
                {0, 0, 1, 0},
                {0, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}};
        return data;
    }
}
