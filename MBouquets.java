class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m*k;
        if(val>bloomDay.length) return -1;
        int max = bloomDay[0];
        int min = bloomDay[0];
        for(int i=1;i<bloomDay.length;i++) {
            max = Math.max(max,bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }
        int low=min;
        int high = max;
        while(low<=high) {
            int mid = (low+high)/2;
            if(findBouquets(bloomDay,mid,m,k)) high = mid-1;
            else low = mid+1;
        }
        return (low>max)?-1:low;
    }
    public boolean findBouquets(int[] bloomDay, int i, int m, int k) {
        int count = 0;
        int bouquets = 0;
        for(int j=0;j<bloomDay.length;j++) {
            if(bloomDay[j] <= i) {
                count++;
                int val = count/k;
                bouquets += val;
                if(val>=1) count = 0;
            }
            else count = 0;
        }
        return (bouquets>=m)? true:false;
    }
}
