package Interview_Prep;

public class SubstringCount {
    public static int countOccurrences(String text, String target) {
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = text.indexOf(target, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += target.length();
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String text = "abababa";
        String target = "aba";
        int occurrences = countOccurrences(text, target);
        System.out.println("Occurrences: " + occurrences); // Output: 3
    }
}
