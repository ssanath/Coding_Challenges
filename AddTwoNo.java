/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0,flag=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    flag=1;
                    break;
                }
            }
            if(flag == 1)
            {
                break;
            }
        }
        int arr[] = {i,j};
        return arr;
    }
}
