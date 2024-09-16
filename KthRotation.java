class Solution {
    public int findKRotation(List<Integer> arr) {
        int low = 0, min=arr.get(0);
        int ind = 0;
        int high = arr.size()-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(min>arr.get(mid)) {
                min = arr.get(mid);
                ind = mid;
            }
            if(arr.get(mid)>=arr.get(low) && arr.get(mid)>=arr.get(high)) low=mid+1;
            else high = mid-1;
        }
        return ind;
    }
}
