class Solution {
    static int merge(long arr[], int low, int mid, int high)
    {
        int count = 0;
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;   
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                count += (mid-left+1);
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }
    static int mergeSort(long arr[], int l, int r)
    {
        int count = 0;
        if (l >= r) return count;
        int mid = (l + r) / 2 ;
        count += mergeSort(arr, l, mid);
        count += mergeSort(arr, mid + 1, r);
        count += merge(arr, l, mid, r);
        return count;
    }
    static long inversionCount(long arr[]) {
        return (long)mergeSort(arr,0,arr.length-1);
    }
}
