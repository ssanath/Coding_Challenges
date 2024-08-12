class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String str = "";
        for(int i=0;i<n;i++) {
            str += ".";
        }
        for(int i=0;i<n;i++) {
            board.add(str);
        }
        solve(0,board,ans,n);
        return ans;
    }
    public void solve(int col, List<String> board, List<List<String>> ans, int n) {
        if(col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int row=0;row<n;row++) {
            if(isSafe(col,row,board,n)) {
                board.set(row, board.get(row).substring(0, col) + 'Q' + board.get(row).substring(col + 1));
                solve(col+1,board,ans,n);
                board.set(row, board.get(row).substring(0, col) + '.' + board.get(row).substring(col + 1));
            }
        }
    }
    public boolean isSafe(int col, int row, List<String> board, int n) {
        int drow = row;
        int dcol = col;
        while(drow >= 0 && dcol >= 0) {
            if(board.get(drow).charAt(dcol) == 'Q') {
                return false;
            }
            drow--;
            dcol--;
        }
        drow = row;
        dcol = col;
        while(dcol >= 0) {
            if(board.get(drow).charAt(dcol) == 'Q') {
                return false;
            }
            dcol--;
        }
        drow = row;
        dcol = col;
        while(drow < n && dcol >= 0) {
            if(board.get(drow).charAt(dcol) == 'Q') {
                return false;
            }
            drow++;
            dcol--;
        }
        return true;
    }
}
