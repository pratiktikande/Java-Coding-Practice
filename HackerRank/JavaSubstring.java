package HackerRank;

import java.util.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(str.substring(start, end));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande