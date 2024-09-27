class Solution {
    public String largestOddNumber(String num) {
        int end = num.length()-1;
        for(int i=end;i>=0;i--) {
            if(num.charAt(i) % 2 == 1) return num.substring(0,i+1);
        }
        return "";
    }
}
