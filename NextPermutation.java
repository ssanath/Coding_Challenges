class Solution {
    public int[] nextPermutation(int[] nums) {
        int bkpt = -1,pos=0,temp=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                bkpt=i;
                break;
            }
        }
        if(bkpt == -1)
        {
            reverse(nums,0,nums.length-1);
            return nums;
        }
        pos = bkpt+1;
        for(int i=bkpt+1;i<nums.length;i++)
        {
            if(nums[i]>nums[bkpt] && nums[i]<=nums[pos])
            {
                pos=i;
            }
        }
        temp = nums[bkpt];
        nums[bkpt] = nums[pos];
        nums[pos] = temp;
        reverse(nums,bkpt+1,nums.length-1);
        return nums;
    }
    public void reverse(int nums[],int start, int end)
        {
            int temp=0;
            while(start<end)
            {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
}
