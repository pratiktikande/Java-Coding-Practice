package DSA.BackTracking;

public class GridWays {
    //Exponential Time Complexity (Worst Case)
    public static int gridWaysCalculate(int i,int j , int n , int m){
        //Base Case
        if(i==n-1 && j==m-1){
            return 1;
        }   
        //Boundary Condition
        if(i==n || j==m){
            return 0;
        }
        int Ways1 = gridWaysCalculate(i+1, j, n, m);
        int Ways2 =gridWaysCalculate(i, j+1, n, m);
        return Ways1+Ways2;
     }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(gridWaysCalculate(0, 0, n, m));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande
