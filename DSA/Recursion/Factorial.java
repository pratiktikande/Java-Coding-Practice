package DSA.Recursion;

public class Factorial {

    public static int factCal(int n){
        if(n ==0){
            return 1;
        }
        int fnm1= factCal( n-1);
        int fn=n* fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factCal(n));
        }
}
