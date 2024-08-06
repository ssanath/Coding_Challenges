/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        findPaths(root,mainList,list);
        
        return mainList;
    }
    public static void findPaths(Node root, ArrayList<ArrayList<Integer>> mainList, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.data);
        
        if(root.left == null && root.right == null) {
            mainList.add(new ArrayList<>(list));
        }
        else {
            findPaths(root.left,mainList,list);
            findPaths(root.right,mainList,list);
        }
        
        list.remove(list.size()-1);
    }
}
