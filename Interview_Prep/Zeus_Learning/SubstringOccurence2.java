package Interview_Prep.Zeus_Learning;

// Using regular expressions

import java.util.regex.*;

public class SubstringOccurence2 {
    public static void main(String[] args) {
        String mainString = "This is a sample string. This is a substring example.";
        String substringToFind = "substring";

        Pattern pattern = Pattern.compile(substringToFind);
        Matcher matcher = pattern.matcher(mainString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("The substring \"" + substringToFind + "\" appears " + count + " times.");
    }
}

