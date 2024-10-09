class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node temp = head, left = head;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(temp.next != null) temp = temp.next;
        Node right = temp;
        while(left.data < right.data) {
            int sum = left.data+right.data;
            if(sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(sum < target) left = left.next;
            else right = right.prev;
        }
        return result;
    }
}
