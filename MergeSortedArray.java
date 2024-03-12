import java.util.*;
public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int ptr1 = a.length-1;
        int ptr2 = 0;
        long temp=0;
        while(true)
        {
            if(b[ptr2]<a[ptr1])
            {
                temp = a[ptr1];
                a[ptr1] = b[ptr2];
                b[ptr2] = temp;
                ptr1--;
                ptr2++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
