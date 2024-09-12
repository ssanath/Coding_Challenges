class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int n = arr.length;
        List<int[]> result = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(result.size()==0 || arr[i][0]>result.get(result.size()-1)[1]) {
                result.add(arr[i]);
            }
            else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],arr[i][1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
