package November;

public class ReverseString2 {
    public static String reverseStringApproach(String s1) {
        // Create a StringBuilder with the input string
        StringBuilder str = new StringBuilder(s1);

        // Reverse the StringBuilder
        str.reverse();

        // Return as a String
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStringApproach("Pratik"));
    }
}
