package DSA.Recursion;

public class TilingProblem {
    //IMP Que(Amazon)

    public static int TilingSol(int n){
        // Board / Flor Size is 2 X n

        // Base Case
        if(n ==0 || n == 1){
            return 1;
        }
        
        //For Verticle Choice
        int Verticle = TilingSol(n-1);

        // For Horizontal Choice
        int Horizontal = TilingSol(n-2);

        //Total Choice
        int Totalways= Verticle+ Horizontal;

        return Totalways;
    }

    public static void main(String[] args) {
        System.out.println(TilingSol(4));
    }
}
