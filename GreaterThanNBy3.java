class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int cnt1=0,cnt2=0,ele1=0,ele2=0;
        for(int i=0;i<nums.length;i++) {
            if(cnt1 == 0 && ele2 != nums[i]) {
                cnt1=1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i]) {
                cnt2=1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == ele1) {
                cnt1++;
            }
            if(nums[i] == ele2) {
                cnt2++;
            }
        }

        if(cnt1 > nums.length/3) {
            result.add(ele1);
            if(ele1 == ele2) {
                return result;
            }
        }

        if(cnt2 > nums.length/3) {
            result.add(ele2);
        }

        return result;
    }
}
