class Solution{
    ArrayList<Integer> subSet = new ArrayList<>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       Sum(arr,N,0,0);
       Collections.sort(subSet);
       return subSet;
    }
    public void Sum(ArrayList<Integer> arr, int N, int ind, int sum){
            if(ind == N)
            {
                subSet.add(sum);
                return;
            }
            Sum(arr,N,ind+1,sum+arr.get(ind));
            Sum(arr,N,ind+1,sum);
    }
}
