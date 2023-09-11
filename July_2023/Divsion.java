package July_2023;

import java.util.Scanner;

public class Divsion {
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if(num % 3 ==0 && num % 5==0){
                System.out.println("xY");
            }else if (num % 5 ==0) {
                System.out.println("Y");    
            }else if(num % 3 ==0 ){
                System.out.println("X");
            }
                 sc.close();
        }
    }