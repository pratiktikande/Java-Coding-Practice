package HackerRank;
import java.util.*;

public class JavaStringsIntroduction {


    private static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(capitalize(A) + " " + capitalize(B));
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande