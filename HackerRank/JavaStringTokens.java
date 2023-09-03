package HackerRank;

import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string from the user and remove leading/trailing spaces
        String s = scanner.nextLine().trim();
        scanner.close();
        
        // If the input string is empty, there are no tokens
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        // Split the input string into tokens using the given regular expression
        // The regular expression "[ !,?._'@]+" matches any combination of the specified characters
        String[] tokens = s.split("[ !,?._'@]+");
        
        // Print the number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande