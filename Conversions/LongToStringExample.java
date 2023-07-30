package Conversions;

//Method 1: Using String.valueOf(long)

public class LongToStringExample {
    public static void main(String[] args) {
        long number = 123456789L;
        String convertedString = String.valueOf(number);
        System.out.println("Converted String: " + convertedString);
    }
}

