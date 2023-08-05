package DSA.Recursion;

public class XToThePowerN {
    
    public static int Power(int x , int n){
        // Base Case
        if(n == 0){
            return 1;
        }

        //Recursion function
        int xnm1 = Power(x, n-1);
        int xn = x * xnm1;
        return xn;

       // return x * Power(x, n-1);

    }

    public static void main(String[] args) {
        System.out.println(Power(2, 10));
    }
}
