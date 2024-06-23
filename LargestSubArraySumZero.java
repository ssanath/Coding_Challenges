class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int len = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            
            if(sum == 0) {
                len = i+1;
            }
            else {
                if(map.get(sum) != null) {
                    len = Math.max(len,i-map.get(sum));
                }
                else {
                    map.put(sum,i);
                }
            }
        }
        
        return len;
    }
}
