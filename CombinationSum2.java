class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansList = new ArrayList<>();
        combinations(0, candidates, target, new ArrayList<>(), ansList);
        return ansList;
    }
    public void combinations(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ansList) {
        if(target == 0) {
            ansList.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=ind;i<candidates.length;i++) {
            if(i>ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ds.add(candidates[i]);
            combinations(i+1,candidates,target-candidates[i],ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
}
