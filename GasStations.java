public class Solution {
    public static double MinimiseMaxDistance(int []arr, int K){
        double maxDist = 0;
        for(int i=1;i<arr.length;i++) {
            maxDist = Math.max(maxDist, (double) arr[i]-arr[i-1]);
        }
        double low = 0.0;
        double high = maxDist;
        while(high-low > 1e-6) {
            double mid = (low+high)/(2.0);
            if(canPlace(arr,mid,K)) high = mid;
            else low = mid;
        }
        return high;
    }
    public static boolean canPlace(int[] arr, double maxDist, int K) {
        int count = 0;
        for(int i=1;i<arr.length;i++) {
            int no = (int) ((arr[i]-arr[i-1])/maxDist);
            if(arr[i]-arr[i-1] == no*maxDist) no--;
            count += no;
            if(count > K) return false;
        }
        return true;
    }
}
