package July_2023;

public class SudokuSolver {
    public static boolean solveSudoku(int[][] board) {
        int N = board.length;
        System.out.println(N);

        // Find an empty cell
        int[] emptyCell = findEmptyCell(board);
        if (emptyCell == null) {
            return true; // All cells are filled
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        // Try placing digits 1 through 9
        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true; // Continue with the next empty cell
                }

                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid number found for this cell
    }

    public static int[] findEmptyCell(int[][] board) {
        int N = board.length;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) {
                    return new int[]{row, col};
                }
            }
        }
        return null; // No empty cell found
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false; // Check row and column
            }
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false; // Check 3x3 region
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        int N = board.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudokuBoard = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(sudokuBoard)) {
            System.out.println("Sudoku solved:");
            printBoard(sudokuBoard);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande

