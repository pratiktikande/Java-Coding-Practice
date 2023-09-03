package DSA.Recursion;
 public class FriendsPairingProblem {

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //chocice 
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //toWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

        //One Line statement
       // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
 
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
 }
 
//www.github.com/pratiktikande
//@Pratik Tikande