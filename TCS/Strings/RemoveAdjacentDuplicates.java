package TCS.Strings;

public class RemoveAdjacentDuplicates {
    // Two Pointer Solution
    class Solution {
        public String removeDuplicates(String s) {
            if (s.length() <= 1) return s;
    
            StringBuilder sb = new StringBuilder(s);
    
            int slow = 0, fast = 1;
            while (fast < sb.length()) {
                if (sb.charAt(slow) == sb.charAt(fast)) {
                    sb.deleteCharAt(slow);
                    sb.deleteCharAt(slow);
                    if (slow != 0) slow--;
                    if (fast != 1) fast--;
                } else {
                    slow++;
                    fast++;
                }
            }
            return sb.toString();
        }
    }
}