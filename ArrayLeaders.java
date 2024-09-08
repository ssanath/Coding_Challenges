class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = arr[n-1];
        answer.add(max);
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>=max) {
                max = arr[i];
                answer.add(0,max);
            }
        }
        return answer;
    }
}
