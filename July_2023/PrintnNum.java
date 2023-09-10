package July_2023;

import java.util.Scanner;

// public class PrintnNum {
//     public static void main(String[] args) {
//         for(int i=1; i<=7; i++){
//             System.out.println(i);
//         }
//     }
// }

public class PrintnNum {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num= sc.nextInt();
         sc.close();

         boolean isPrime = true;

         for(int i=2; i<=num-1; i++){
            if(num % i==0){
                isPrime =false;
            }
            }
            
            if(isPrime == true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
         }
    }