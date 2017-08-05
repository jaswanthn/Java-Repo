package myAlgos;

public class MaxSquare {

    public static int maxSquareinMatrix(int[][] matrix) {

        //1. find m and n from given matrix

        int m = matrix.length;
        int n = matrix[0].length;

        //2. create a new table matrix to start dynamic programming

        int[][] table = new int[m][n];

        int max = 0;

        //3. iterate through each of the matrix element to find table elements
        for (int i=0; i < m; i++) {
            for (int j=0; j < n; j++) {
                if (i==0 || j==0) {
                    // if first row or column max square would be directly based on the value
                    // since there is nothing to trace from neighbors
                    table[i][j] = matrix[i][j];

                } else if (matrix[i][j] == 0) {
                    // if the cell value has 0 then no way they can form square matrix with 1s and can be ignored
                    table[i][j] = 0;

                } else {

                    // minimum of all neighbor cells + 1 would be the max square size with all 1s
                    table[i][j] = Math.min(table[i-1][j-1], Math.min(table[i-1][j], table[i][j-1])) + 1;
                    max = Math.max(max, table[i][j]);
                }
            }
        }

        return max;

    }

}
