class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        subSet(nums,0,new ArrayList<>(), ansList);
        return ansList;
    }
    public void subSet(int[] nums, int ind, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++)
        {
            if(i != ind && nums[i] == nums[i-1])
            {
                continue;
            }
            ds.add(nums[i]);
            subSet(nums,i+1,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
}
