class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        int n = arr.size();
        int maxSum = 0;
        for(int i=0;i<n-1;i++) {
            int sum = arr.get(i) + arr.get(i+1);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
