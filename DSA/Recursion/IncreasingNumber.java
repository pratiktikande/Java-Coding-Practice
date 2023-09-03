package DSA.Recursion;

public class IncreasingNumber {

    public static void increseDec(int n){
        //Base Case
        if (n==10){
            System.out.println(n);
            //If you Dont Write Base Case Then stack Overflow Occures 
            return;
        }

        //Recursion Function
        System.out.print(n + " ");
        increseDec(n+1);

    }
    public static void main(String[] args) {
        int n=1;
        increseDec(n);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande