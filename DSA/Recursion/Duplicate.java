package DSA.Recursion;

public class Duplicate {
    public static void removeDuplicate(String str, int idx , StringBuilder newstr , boolean map[]){
         //Base case      
         if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // Conditions 
        char Currentchar = str.charAt(idx);
        if(map[Currentchar - 'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[Currentchar -'a'] =true;
            removeDuplicate(str, idx+1, newstr.append(Currentchar), map);
        }
    }
    public static void main(String[] args) {
        String str ="pratiktikande";
        removeDuplicate(str, 0, new StringBuilder(" "), new  boolean[26]);
    }
}
