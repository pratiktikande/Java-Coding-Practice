package DSA.BackTracking;

public class NqueenSafe {
    public static boolean isSafe(char board[][], int row, int col){
        //Vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal Left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board [i][j]=='Q'){
                return false;
            }
        }
        //Diagonal Right up
         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board [i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

     public static void nQueen(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            printBoard(board);
            return;

        }
        // coloumn loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board , row ,j)){
                  board[row][j] = 'Q';
            //Function Call
            nQueen(board, row + 1);
            //BackTracking
            board[row][j] = 'x';
            }
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
        int n = 4;
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