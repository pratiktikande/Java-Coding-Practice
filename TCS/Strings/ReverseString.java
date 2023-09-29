package TCS.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder reversed = new StringBuilder(original).reverse();
        String result = reversed.toString();
        System.out.println(result);
    }
}


//Using Loop
// public class ReverseString {
//     public static void main(String[] args) {
//         String original = "Hello, World!";
//         String reversed = reverseString(original);
//         System.out.println(reversed);
//     }

//     public static String reverseString(String input) {
//         StringBuilder reversed = new StringBuilder();
//         for (int i = input.length() - 1; i >= 0; i--) {
//             reversed.append(input.charAt(i));
//         }
//         return reversed.toString();
//     }
// }
