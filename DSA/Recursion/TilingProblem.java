package DSA.Recursion;

public class TilingProblem {
    //IMP Que(Amazon)

    public static int tilingSol(int n){
        // Board / Flor Size is 2 X n

        // Base Case
        if(n ==0 || n == 1){
            return 1;
        }
        
        //For Verticle Choice
        int Verticle = tilingSol(n-1);

        // For Horizontal Choice
        int Horizontal = tilingSol(n-2);

        //Total Choice
        int Totalways= Verticle+ Horizontal;

        return Totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilingSol(4));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande
