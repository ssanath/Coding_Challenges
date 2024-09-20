class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCap = 0;
        for(int weight : weights) {
            maxCap += weight;
        }
        int low=1;
        int high = maxCap;
        while(low<=high) {
            int mid = (low+high)/2;
            if(checkCap(weights,days,mid)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public boolean checkCap(int weights[], int days, int currCap) {
        int ptr=0;
        for(int i=0;i<days;i++) {
            int cap = 0;
            while(ptr<weights.length && cap + weights[ptr]<=currCap) {
                cap += weights[ptr];
                ptr++;
            }
            if(ptr>=weights.length) return true;
        }
        return false;
    }
}
