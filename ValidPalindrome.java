class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseStr = s.toLowerCase();
        String cleanStr = lowerCaseStr.replaceAll("[^a-z0-9]","");
        int start = 0, end = cleanStr.length()-1;

        return palindrome(cleanStr,start,end);
    }
    boolean palindrome(String cleanStr, int start, int end) {
        if(start<end) {
            if(cleanStr.charAt(start)==cleanStr.charAt(end)) {
                start++;
                end--;
                return palindrome(cleanStr,start,end);
            }
            else {
                return false;
            }
        }

        return true;
    }
}
