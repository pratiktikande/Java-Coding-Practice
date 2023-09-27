package Interview_Prep.Zeus_Learning;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String inputSentence = "This is a sample sentence to reverse alternate words";
        String[] words = inputSentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Reverse every alternate word
            if (i % 2 == 1) {
                StringBuilder reversedWord = new StringBuilder(words[i]);
                words[i] = reversedWord.reverse().toString();
            }

            // Append the word to the result
            result.append(words[i]);

            // Add a space unless it's the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Input Sentence: " + inputSentence);
        System.out.println("Output Sentence: " + result.toString());
    }
}
