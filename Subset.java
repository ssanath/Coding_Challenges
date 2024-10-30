class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getSubsets(0,result,new ArrayList<>(),nums);
        return result;
    }
    public void getSubsets(int i,List<List<Integer>> result,List<Integer> subsetList,int[] nums) {
        if(i == nums.length) {
            result.add(new ArrayList<>(subsetList));
            return;
        }
        subsetList.add(nums[i]);
        getSubsets(i+1,result,subsetList,nums);
        subsetList.remove(subsetList.size()-1);
        getSubsets(i+1,result,subsetList,nums);
    }
}
