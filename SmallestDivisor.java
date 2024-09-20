class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max,nums[i]);
        }
        int low=1;
        int high = max;
        while(low<=high) {
            int mid = (low+high)/2;
            int sum = findSum(nums,mid);
            if(sum<=threshold) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int findSum(int[] nums, int divisor) {
        int sum = 0;
        for(int num : nums) {
            sum += (int) Math.ceil((double) num/divisor);
        }
        return sum;
    }
}
