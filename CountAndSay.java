class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }

        String previous = countAndSay(n-1);

        return RLE(previous);
    }
    public String RLE(String s) {
        StringBuilder str = new StringBuilder();
        int i = 0;

        while(i<s.length()) {
            char ch = s.charAt(i);
            int count  = 0;
            while(i<s.length() && ch == s.charAt(i)) {
                count++;
                i++;
            }
            str.append(count).append(ch);
        }

        return str.toString();
    }
}
