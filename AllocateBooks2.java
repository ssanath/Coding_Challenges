import java.util.ArrayList;
import java.util.Collection;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int sum=0;
        int max = 0;
        for(int pages : arr) {
            sum += pages;
            max = Math.max(max, pages);
        }
        int low = max, high = sum;
        while(low<=high) {
            int mid = (low+high)/2;
            if(canAllocate(arr,mid,m)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static boolean canAllocate(ArrayList<Integer> arr, int maxPages, int m) {
        int count = 1;
        int pageSum = 0;
        for(int pages : arr) {
            if(pageSum + pages > maxPages) {
                count++;
                pageSum = pages;
                if(count > m) return false;
            }
            else pageSum += pages;
        }
        return true;
    }
}
