class Solution {
    int count(int[] arr, int n, int x) {
        int first = binSearch(arr,x,true);
        if(first == -1 ) return 0;
        int last = binSearch(arr,x,false);
        return last-first+1;
    }
    public int binSearch(int[] nums, int target, boolean startPos) {
        int low = 0;
        int high = nums.length-1;
        int pos = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid]==target) {
                pos = mid;
                if(startPos) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return pos;
    }
}
