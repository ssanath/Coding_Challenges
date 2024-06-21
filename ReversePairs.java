class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public void merge(int nums[], int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=high) {
            if(nums[i] < nums[j]) {
                temp.add(nums[i]);
                i++;
            }
            else {
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=mid) {
            temp.add(nums[i]);
            i++;
        }
        while(j<=high) {
            temp.add(nums[j]);
            j++;
        }
        for(int k=low;k<=high;k++) {
            nums[k] = temp.get(k-low);
        }
    }
    public int countPairs(int nums[], int low, int  mid, int high) {
        int cnt=0;
        int right = mid+1;
        for(int i=low;i<=mid;i++) {
            while(right<=high && (long) nums[i] > 2 * (long) nums[right]) right++;
            cnt += (right-(mid+1));
        }
        return cnt;
    }
    public int mergeSort(int[] nums, int low, int high) {
        int cnt=0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt += mergeSort(nums,low,mid);
        cnt += mergeSort(nums,mid+1,high);
        cnt += countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
}
