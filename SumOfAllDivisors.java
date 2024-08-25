class Solution{
    static long sumOfDivisors(int N){
        long totSum = 0;
        for(int d=1;d<=N;d++) {
            totSum += d*(N/d);
        }
        return totSum;
    }
}
