class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        int pos = insertAtPos(intervals,newInterval);
        for(int i=0;i<=n;i++) {
            if(i==pos) {
                if(result.size()==0 || newInterval[0]>result.get(result.size()-1)[1]) {
                    result.add(newInterval);
                } else {
                    result.get(result.size()-1)[1] = 
                    Math.max(result.get(result.size()-1)[1],newInterval[1]);
                }
            }
            if(i<n) {
                if(result.size()==0 || intervals[i][0]>result.get(result.size()-1)[1]) {
                    result.add(intervals[i]);
                } else {
                    result.get(result.size()-1)[1] = 
                    Math.max(result.get(result.size()-1)[1],intervals[i][1]);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public int insertAtPos(int[][] intervals, int[] newInterval) {
        int low = 0;
        int high = intervals.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(intervals[mid][0] == newInterval[0]) {
                return mid+1;
            }
            else if(intervals[mid][0]<newInterval[0]) low = mid+1;
            else high = mid-1;
        }
        return high+1;
    }
}
