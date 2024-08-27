// User function Template for Java

class Solution {
    long sumOfSeries(long n) {
        if(n==1) return n;
        return (long) Math.pow(n,3) + sumOfSeries(n-1);
    }
}
