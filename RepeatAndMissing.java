public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int arr[] = new int[A.length+1];
        int res[] = new int[2];
        for(int i=0;i<A.length;i++) {
            arr[A[i]]++;
            if(arr[A[i]] == 2) {
                res[0] = A[i];
            }
        }
        for(int i=1;i<arr.length;i++) {
            if(arr[i] == 0) {
                res[1] = i;
                break;
            }
        }
        
        return res;
    }
}
