package Conversions;
import java.text.DecimalFormat;

public class DoubleToStringExample3 {
    //Method 4: Using DecimalFormat
    public static void main(String[] args) {
        double number = 123.45;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String convertedString = decimalFormat.format(number);
        System.out.println("Converted String: " + convertedString);
}
}
