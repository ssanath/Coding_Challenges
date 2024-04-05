class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        combinations(0, candidates, target, new ArrayList<>(), ansList);
        return ansList;
    }
    public void combinations(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ansList) {
        if(ind == candidates.length) {
            if(target == 0) {
                ansList.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[ind] <= target)
        {
             ds.add(candidates[ind]);
             combinations(ind,candidates,target-candidates[ind],ds,ansList);
             ds.remove(ds.size()-1);
        }
        combinations(ind+1,candidates,target,ds,ansList);
    }

}
