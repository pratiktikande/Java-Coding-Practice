package Interview_Prep;

//Reverse String: Write a function to reverse a string in-place.
public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original string: " + new String(str));
        reverseString(str);
        System.out.println("Reversed string: " + new String(str));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande