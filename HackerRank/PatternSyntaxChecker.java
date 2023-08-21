package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        //check Test cases
        for(int i=0; i<n; i++){
            String sr =sc.nextLine();
            try{
                Pattern.compile(sr);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}


