package HackerRank;

import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNext()) {
            System.out.println(++n + " " + sc.nextLine());
        }
        sc.close();
    }
}

