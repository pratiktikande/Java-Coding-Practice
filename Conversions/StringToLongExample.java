package Conversions;

//Method 1: Using Long.parseLong()
public class StringToLongExample {
    public static void main(String[] args) {
        String numericString = "123456789";
        long convertedLong = Long.parseLong(numericString);
        System.out.println("Converted long value: " + convertedLong);
    }
}

