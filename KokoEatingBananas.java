class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = findMax(piles);
        while(low<=high) {
            int mid = (low+high)/2;
            double time = totTime(piles,mid);
            if(time<=h) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int findMax(int[] piles) {
        int max = piles[0];
        for(int i=1;i<piles.length;i++) {
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    public double totTime(int[] piles, int i) {
        double time = 0;
        for(int pile: piles) {
            double x = (double)pile/i;
            double val = Math.ceil(x);
            if(val==0) val = 1;
            time += val;
        }
        return time;
    }
}
