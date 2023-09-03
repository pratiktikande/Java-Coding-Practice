package July_2023;
import java.util.Scanner;


public class Userinputfunction {
    public static void Userinputadd(int a,int b){
        System.out.println("The Sum Of Two Numbers Is " + (a+b));
    }
    public static void main(String[] args) {
          System.out.println("Enter The Two Numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        Userinputadd(a,b);
        sc.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande