package Interview_Prep.Zeus_Learning;

public class CaseConversion {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String uppercaseResult = convertToUppercase(input);
        String lowercaseResult = convertToLowercase(input);

        System.out.println("Uppercase: " + uppercaseResult);
        System.out.println("Lowercase: " + lowercaseResult);
    }

    public static String convertToUppercase(String input) {
        // Convert the input string to a character array
        char[] chars = input.toCharArray();
        
        // Iterate through each character in the array
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is a lowercase letter (between 'a' and 'z')
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                // Convert the lowercase letter to uppercase by adjusting ASCII values
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }
        }
        // Create a new string from the modified character array and return it
        return new String(chars);
    }

    public static String convertToLowercase(String input) {
        char[] chars = input.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert the uppercase letter to lowercase by adjusting ASCII values
                chars[i] = (char) (chars[i] - 'A' + 'a');
            }
        }  
        return new String(chars);
    }
}
