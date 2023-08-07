package Interview_Prep;

public class PatternPrint {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the pattern
        
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print characters in decreasing order
            char ch = (char) ('A' + n - i - 1);
            for (int k = 0; k <= i; k++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}
