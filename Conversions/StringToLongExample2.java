package Conversions;

//NumberFormatException
public class StringToLongExample2 {
    public static void main(String[] args) {
        String numericString = "123abc"; // Invalid numeric String
        try {
            long convertedLong = Long.parseLong(numericString);
            System.out.println("Converted long value: " + convertedLong);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric string. Cannot convert to long.");
        }
    }
}
