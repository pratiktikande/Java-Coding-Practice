package Interview_Prep;

public class SeriesPrint {
    // Function to calculate factorial of a number
    static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the number of terms in the series

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double term = (double) i / factorial(i); // Calculate the term
            sum += term;
        }

        System.out.println("Sum of the series: " + sum);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande