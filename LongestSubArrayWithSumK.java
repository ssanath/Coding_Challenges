// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int len = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++) {
            sum += A[i];
            if(sum == K) {
                len = Math.max(len,i+1);
            }
            if(map.containsKey(sum-K)) {
                len = Math.max(len,i-map.get(sum-K));
            }
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        return len;
    }
}
