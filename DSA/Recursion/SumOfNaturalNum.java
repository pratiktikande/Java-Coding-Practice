package DSA.Recursion;

public class SumOfNaturalNum {
    public static void main(String[] args) {
         int n=5;
         System.out.println(SumNatural(n));
    }
    public static int SumNatural(int n){
        //Base Case
        if(n==1){
            return 1;
        }
        //Recusrsion Function
         int snm1=SumNatural(n-1);
         int sn= n+snm1;
         return sn;
    }
}
