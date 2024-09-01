class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length)*(nums.length+1)/2;
        int totSum = 0;
        for(int i=0;i<nums.length;i++) {
            totSum += nums[i];
        }
        return sum-totSum;
    }
}
