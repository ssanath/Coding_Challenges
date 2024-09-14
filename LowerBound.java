class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}
