package TCS.Numbers;
public class ConvertaNumbertoHexadecimal {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        char[] hexDigits = "0123456789abcdef".toCharArray();
        
        while (num != 0) {
            result.insert(0, hexDigits[num & 0xF]);
            num >>>= 4; // Unsigned right shift by 4 bits
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        ConvertaNumbertoHexadecimal converter = new ConvertaNumbertoHexadecimal();
        
        System.out.println(converter.toHex(26));  // Output: "1a"
        System.out.println(converter.toHex(-1));  // Output: "ffffffff"
    }
}
