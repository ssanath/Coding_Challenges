class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long low = 0, high = (long) 1e18;
        while(low<=high) {
            long mid = low+(high-low)/2;
            if(canReduce(mountainHeight,workerTimes,mid)) high = mid-1;
            else low = mid+1;
        }
        return (long) low;
    }
    public boolean canReduce(int mountainHeight, int[] workerTimes, long T) {
        long totalHeightReduced = 0L;
        for(int time : workerTimes) {
            long x = (long) Math.floor((-1 + Math.sqrt(1+8.0*T/time))/2);
            totalHeightReduced += x;
            if(totalHeightReduced>=mountainHeight) return true;
        }
        return totalHeightReduced>=mountainHeight;
    }
}
