class Solution {
    public int maxDepth(String s) {
        int maxCount = 0, count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else if(c == ')') count--;
        }
        return maxCount;
    }
}
