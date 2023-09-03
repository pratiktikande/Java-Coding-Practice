package Conversions;

public class CharToIntConversionExample {
    public static void main(String[] args) {
        char charValue = 'A';
        int intValue = (int) charValue;
        System.out.println("Converted int value: " + intValue);
        
        //and

        char digitChar = '5';
        int numericValue = Character.getNumericValue(digitChar);
        System.out.println("Numeric value of '" + digitChar + "': " + numericValue);

    }
}

//www.github.com/pratiktikande
//@Pratik Tikande