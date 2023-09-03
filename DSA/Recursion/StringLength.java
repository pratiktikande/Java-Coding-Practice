package DSA.Recursion;


public class StringLength {
    public static int length(String str){
        //Base Case
        if(str.length()==0){
            return 0;
        }
        //Recursion Function
        return length(str.substring(1)) +1;
   }

   public static void main(String[] args) {
    String str = "abcdes";
    System.out.println(length(str));
   }
}

//www.github.com/pratiktikande
//@Pratik Tikande