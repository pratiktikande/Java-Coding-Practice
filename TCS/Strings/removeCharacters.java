package TCS.Strings;

public class removeCharacters {
    public static String removeCharacterss(String string1, String string2) {
        // Create a boolean array to mark characters in string2
        boolean[] mark = new boolean[26];

        // Mark characters in string2
        for (char c : string2.toCharArray()) {
            mark[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        // Append characters from string1 that are not marked in string2
        for (char c : string1.toCharArray()) {
            if (!mark[c - 'a']) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        String result = removeCharacterss(string1, string2);
        System.out.println(result); 

        string1 = "occurrence";
        string2 = "car";
        result = removeCharacterss(string1, string2);
        System.out.println(result); 
    }
}
