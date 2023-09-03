package HackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void Para(int base, int height){
        if(base> 0 && height>0){
            System.out.println(base*height);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height =sc.nextInt();
        sc.close();
        Para(base, height);
    }   
}

//www.github.com/pratiktikande
//@Pratik Tikande
