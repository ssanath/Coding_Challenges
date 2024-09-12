class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(nums[mid]==target) return range(mid,nums,target);
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        int result[] = {-1,-1};
        return result;
    }
    public int[] range(int mid, int[] nums, int target) {
        int start = mid, end = mid, n = nums.length;
        while(start>=0 && nums[start]==nums[mid]) start--;
        while(end<n && nums[end]==nums[mid]) end++;
        int result[] = {start+1,end-1};
        return result;
    }
}
