class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length(), n2 = needle.length();
        if (n2 == 0) return 0;
        
        for (int i = 0; i <= n1 - n2; i++) {
            int j = 0;
            while (j < n2 && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == n2) return i;
        }
        
        return -1;
    }
}
