package Interview_Prep.Zeus_Learning;

// Using indexOf method
public class SubstringOccurrence {
    public static void main(String[] args) {
        String mainString = "This is a sample string. This is a substring example.";
        String substringToFind = "substring";

        int count = 0;
        int index = mainString.indexOf(substringToFind);

        while (index != -1) {
            count++;
            index = mainString.indexOf(substringToFind, index + 1);
        }

        System.out.println("The substring \"" + substringToFind + "\" appears " + count + " times.");
    }
}
