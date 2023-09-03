package July_2023;

class PrimeOrNot {

    public static boolean CheckPrimeOrNot(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
    
        if (!flag)
          System.out.println(num + " is a prime number.");
        else
          System.out.println(num + " is not a prime number.");
        return flag;
      }
    public static void main(String[] args) {
        CheckPrimeOrNot(7);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande