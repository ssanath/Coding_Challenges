class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ptr1 = 0, ptr2=0, count=0, max=0;
        while(ptr1 < n && ptr2 < n)
        {
            if(arr[ptr1] <= dep[ptr2])
            {
                ptr1++;
                count++;
            }
            else if(arr[ptr1] > dep[ptr2])
            {
                ptr2++;
                count--;
            }
            if(count >= max)
            {
                max = count;
            }
        }
        return max;
    }
    
}
