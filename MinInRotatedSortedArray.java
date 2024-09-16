class Solution {
    public int findMin(int[] nums) {
        int low = 0, min=nums[0];
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            min = Math.min(min,nums[mid]);
            if(nums[mid]>=nums[low] && nums[mid]>=nums[high]) low=mid+1;
            else high = mid-1;
        }
        return min;
    }
}
