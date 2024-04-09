import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        int end = s.length()-1;
        int start = end;
        while(start >= 0) {
            while(end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            start = end;
            while(start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            result.append(s.substring(start+1,end+1)).append(" ");
            end = start;
        }
        return result.toString().trim();
    }
}
