package DSA.BackTracking;

public class FindPermutation {

    //TC = O(n* n!)

    public static void findpermutation(String str, String ans){
        //Base Case
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"Abcd" = "a" + "cd" = acd
          String  Newstr = str.substring(0, i)+str.substring(i+1);
            findpermutation(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str ="abc";
        findpermutation(str, "");
    }
    
}


//www.github.com/pratiktikande
//@Pratik Tikande