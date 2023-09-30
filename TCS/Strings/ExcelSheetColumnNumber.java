package TCS.Strings;

public class ExcelSheetColumnNumber {
        public int titleToNumber(String s) {
         int result = 0;
         for (int i = s.length() - 1; i >= 0; i--) {
             char c = s.charAt(i);
             int numericValue = c - 'A' + 1;
             result += numericValue * Math.pow(26, s.length() - 1 - i);
         }
         return result;
     }
     }
