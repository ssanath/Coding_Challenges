class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        getParenthesis(n,0,0,new StringBuilder(),result);
        return result;
    }
    public void getParenthesis(int n, int open, int close, StringBuilder string, List<String> result) {
        if(open == n && close == n) {
            result.add(string.toString());
            return;
        }
        if(open < n) {
            string.append("(");
            getParenthesis(n,open+1,close,string,result);
            string.deleteCharAt(string.length()-1);
        }
        if(close < open) {
            string.append(")");
            getParenthesis(n,open,close+1,string,result);
            string.deleteCharAt(string.length()-1);
        }
    }
}
