package July_2023;

import java.util.Scanner;

public class ReverseANumber {
    public static void Reverse(int num){
        int rev=0;
        while(num>0){
            int last_dig=num%10;
            rev =rev*10+last_dig;
            num=num/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        System.out.println("Enter The Number To Revese ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Reverse(num);
        sc.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande