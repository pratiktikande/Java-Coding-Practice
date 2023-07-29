package Conversions;

public class StringToDoubleExample2 {
    //handling the NumberFormatException
    public static void main(String[] args) {
        String strNumber = "3.14";
        try {
            double doubleValue = Double.parseDouble(strNumber);
            System.out.println("Parsed double value: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input string.");
        }
    }
}

