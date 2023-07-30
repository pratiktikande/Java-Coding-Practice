package Conversions;

public class DoubleToStringExample12 {
    //Method 3: Using String.format()
    public static void main(String[] args) {
        double number = 123.45;
        String convertedString = String.format("%.2f", number);
        System.out.println("Converted String: " + convertedString);
    }
}
