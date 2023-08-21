package DSA.TimeAndSpaceComplexity;

public class SpaceComplexity {
    int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

// In Java, you can analyze space complexity by considering the amount of memory
// used by variables, data structures, and auxiliary space used during the
// execution of an algorithm. the space complexity of the factorial function is
// O(n) due to the recursive call stack consuming memory proportional to the
// input 'n'.
