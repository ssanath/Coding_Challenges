class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int answer[] = {-1,Integer.MAX_VALUE};
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                answer[0] = arr[i];
                answer[1] = arr[i];
                break;
            }
            else if(arr[i]<x) answer[0] = Math.max(answer[0],arr[i]);
            else answer[1] = Math.min(answer[1],arr[i]);
        }
        if(answer[1] == Integer.MAX_VALUE) answer[1] = -1;
        return answer;
    }
}
