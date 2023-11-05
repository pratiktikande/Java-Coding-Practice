package November;

public class ReplaceChar {
    public static String replaceCharacter(String str, char c1, char c2) {
        // Create String Builder
        StringBuilder strr = new StringBuilder(str);

        // Loop To Check The character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c1) {
                strr.append(c2);
            } else if (str.charAt(i) == c2) {
                strr.append(c1);
            } else {
                strr.append(str.charAt(i));
            }

            // To String Convert
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("shrek", 'h', 'e'));
    }
}


/*package November;

public class ReplaceChar {
    public static String replaceCharacter(String str, char c1, char c2) {
        // Create a StringBuilder
        StringBuilder strr = new StringBuilder(str);

        // Loop to Check the characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c1) {
                strr.setCharAt(i, c2);
            } else if (str.charAt(i) == c2) {
                strr.setCharAt(i, c1);
            }
        }

        // Convert StringBuilder to String
        return strr.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("shrek", 'h', 'e'));
    }
}
 */