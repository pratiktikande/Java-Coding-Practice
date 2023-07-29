package Conversions;

public class StringToDoubleExample1 {
    //Using Double.valueOf()
    public static void main(String[] args) {
        String strNumber = "3.14";
        Double doubleValue = Double.valueOf(strNumber);
        System.out.println("Parsed double value: " + doubleValue);
    }
    
}
