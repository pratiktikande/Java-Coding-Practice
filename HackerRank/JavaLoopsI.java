package HackerRank;

import java.util.Scanner;
public class JavaLoopsI {  
    public static void Loop(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }

    //or
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int N = in.nextInt();
    //     for (int i = 1; i <= 10; i++) {
    //         System.out.println(N + " x " + i + " = " + N * i);
    //     }
    //     in.close();
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Loop(num);
        sc.close();
    }
}
