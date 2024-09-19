class Solution
{
    public int NthRoot(int n, int m)
    {
        int low = 1;
        int high = m;
        while(low<=high) {
            int mid = (low+high)/2;
            long val = power(mid, n);
            if(val == m) return mid;
            else if(val<m) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        }
        return result;
    }
}
