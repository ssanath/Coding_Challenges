class Solution {
    public int rowWithMax1s(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        int maxCount = 0, row = -1;
        for(int i=0;i<m;i++) {
            int left = binSearch(arr,i,n,true);
            if(left == -1) continue;
            int right = binSearch(arr,i,n,false);
            int count = right-left+1;
            if(count>maxCount) {
                row = i;
                maxCount = Math.max(maxCount,count);
            }
        }
        return row;
    }
    public int binSearch(int arr[][], int row, int n, boolean startPos) {
        int low = 0;
        int high = n-1;
        int pos = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[row][mid] == 1) {
                pos = mid;
                if(startPos) {
                    high = mid-1;
                }
                else low = mid+1;
            }
            else low = mid+1;
        }
        return pos;
    }
}
