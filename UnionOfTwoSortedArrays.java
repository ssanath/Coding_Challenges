//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int ptr1=0,ptr2=0;
        while(ptr1<n && ptr2<m) {
            if(arr1[ptr1]==arr2[ptr2]) {
                if(list.size()==0 || list.get(list.size()-1) != arr1[ptr1]) {
                    list.add(arr1[ptr1]);
                }
                ptr1++;
                ptr2++;
            }
            else if(arr1[ptr1]<arr2[ptr2]) {
                if(list.size()==0 || list.get(list.size()-1) != arr1[ptr1]) {
                    list.add(arr1[ptr1]);
                }
                ptr1++;
            }
            else {
                if(list.size()==0 || list.get(list.size()-1) != arr2[ptr2]) {
                    list.add(arr2[ptr2]);
                }
                ptr2++;
            }
        }
        while(ptr1<n) {
            if(list.size()==0 || list.get(list.size()-1) != arr1[ptr1]) {
                list.add(arr1[ptr1]);
            }
            ptr1++;
        }
        while(ptr2<m) {
            if(list.size()==0 || list.get(list.size()-1) != arr2[ptr2]) {
                list.add(arr2[ptr2]);
            }
            ptr2++;
        }
        return list;
    }
}
