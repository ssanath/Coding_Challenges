class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix[0].length, n = matrix.length;
        int low = 0;
        int high = (m*n)-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int row = mid/m, col = mid%m;
            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] > target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }
}
