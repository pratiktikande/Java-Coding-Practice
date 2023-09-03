package DSA.BackTracking;

public class NqueenPossibleWays {
    public static void nQueen(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            printBoard(board);
            return;

        }
        // coloumn loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            //Function Call
            nQueen(board, row + 1);
            //BackTracking
            board[row][j] = 'x';
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-----------------Chess Board----------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande