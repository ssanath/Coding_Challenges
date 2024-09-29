class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder str = new StringBuilder(s);
        str.append(str);
        if(str.toString().contains(goal)) return true;
        return false;
    }
}
