package myAlgos;

public class NQueenSolution {

    // to set n * n size of the board, hence n queens
    private static int N = 8;

    public static boolean isSafeToPlaceUtil(int board[][], int row, int col) {

        int i, j;
        //check for row on left side since only left side has queens
        for (i=0; i < col; i++ ) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // check upper diagonal on left side
        for (i = row, j = col; (i < N && j >= 0); i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // check lower diagonal on left side
        for (i = row, j = col; (i >= 0 && j >= 0);i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean solveNQUtil(int board[][], int col) {
        // Always write base condition for recursion
        if (col >= N) {
            return true;
        }

        // Generic case
        for (int i=0; i < N; i++) {
            if (isSafeToPlaceUtil(board, i, col)) {
                board[i][col] = 1;

                if (solveNQUtil(board, col + 1)) {
                    return true;
                }

                // backtrack values
                board[i][col] = 0;
            }

        }

        // if there is no  possibility hence do this
        return false;

    }

    public static void printBoardUtil(int board[][]) {
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = {{0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0} };
        //before having queens
        NQueenSolution.printBoardUtil(board);
        // after having queens
        if (NQueenSolution.solveNQUtil(board, 0))
        NQueenSolution.printBoardUtil(board);
    }
}
