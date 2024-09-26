class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0, high = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            int maxRow = 0;
            for(int i=0;i<m;i++) {
                if(mat[i][mid] > mat[maxRow][mid]) maxRow = i;
            }
            boolean leftIsBigger = mid-1 >= 0 && mat[maxRow][mid-1] > mat[maxRow][mid];
            boolean rightIsBigger = mid+1 < n && mat[maxRow][mid+1] > mat[maxRow][mid];
            if(!leftIsBigger && !rightIsBigger) return new int[]{maxRow,mid};
            else if(leftIsBigger) high = mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
    }
}
