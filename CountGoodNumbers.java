class Solution {
    public final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenCount = (n+1)/2;
        long oddCount = n/2;
        return (int) ((calcPow(5,evenCount)*calcPow(4,oddCount) % MOD));
    }
    public long calcPow(long base, long exp) {
        if(exp == 0) return 1;
        long answer = calcPow(base,exp/2);
        answer *= answer;
        answer %= MOD;
        if(exp%2 == 1) answer *= base;
        answer %= MOD;
        return answer;
    }
}
