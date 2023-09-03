package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0]; // Initialize the prefix with the first string
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Keep removing characters from the prefix until it is a prefix of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande