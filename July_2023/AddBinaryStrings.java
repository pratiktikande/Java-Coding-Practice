package July_2023;

public class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            
            if (i >= 0)
                sum += a.charAt(i) - '0'; // Convert char to int ('0' -> 0, '1' -> 1)
            
            if (j >= 0)
                sum += b.charAt(j) - '0'; // Convert char to int ('0' -> 0, '1' -> 1)

            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0)
            result.append(carry);

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "101010";
        String b = "1111";
        String sum = addBinary(a, b);
        System.out.println("Sum of binary strings: " + sum);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande