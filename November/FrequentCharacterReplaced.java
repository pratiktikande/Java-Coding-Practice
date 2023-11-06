package November;

public class FrequentCharacterReplaced {
    public static char[] frequentCharacterReplaced(char[] str, char x) {
        if (str.length == 0) {
            return str;
        }

        char mostFrequentCharacter = str[0];
        int maxFrequency = 1;

        for (int i = 0; i < str.length; i++) {
            char currentChar = str[i];
            int currentFrequency = 1;

            for (int j = i + 1; j < str.length; j++) {
                if (str[j] == currentChar) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentCharacter = currentChar;
            }
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i] == mostFrequentCharacter) {
                str[i] = x;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        char[] str = "bbadbbababb".toCharArray();
        char x = 't';

        char[] modifiedStr = frequentCharacterReplaced(str, x);

        System.out.println(new String(modifiedStr));
    }
}

