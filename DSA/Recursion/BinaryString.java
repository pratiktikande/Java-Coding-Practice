package DSA.Recursion;

public class BinaryString {
    //Paytm Intervivew Que

    public static void printbinaryStrings(int n, int lastplace , String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //Recursion function
        printbinaryStrings(n-1, 0, str+"0");
        if(lastplace == 0){
            printbinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printbinaryStrings(3, 0,"");
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande