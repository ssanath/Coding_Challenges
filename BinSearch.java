class Solution {
    static int searchInSorted(int arr[], int N, int K) {
        int index = binSearch(arr,0,N-1,K);
        if(index != -1) return 1;
        return -1;
    }
    static int binSearch(int arr[], int low, int high, int K) {
        int mid = (low+high)/2;
        if(low>high) return -1;
        if(arr[mid]==K) return mid;
        else if(arr[mid]<K) return binSearch(arr,mid+1,high,K);
        else return binSearch(arr,low,mid-1,K);
    }
}
