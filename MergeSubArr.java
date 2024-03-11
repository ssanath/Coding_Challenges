import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class Solution {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        List<List<Integer>> intervaList = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<Integer> list = Arrays.asList(arr[0][0],arr[0][1]);
        intervaList.add(list);
        for(int i=1;i<arr.length;i++)
        {
            List<Integer> l1 = Arrays.asList(arr[i][0],arr[i][1]);
            List<Integer> l2 = intervaList.get(intervaList.size()-1);
            if(l1.get(0)<=l2.get(1))
            {
                List<Integer> l3 = new ArrayList<>();
                l3.add(l2.get(0));
                if(l1.get(1)>l2.get(1))
                {
                    l3.add(l1.get(1));
                }
                else
                {
                    l3.add(l2.get(1));
                }
                intervaList.remove(intervaList.size()-1);
                intervaList.add(l3);
            }
            else
            {
                intervaList.add(l1);
            }

        }
        return intervaList;
    }
}
