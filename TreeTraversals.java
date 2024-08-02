/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(inOrder(root, new ArrayList<>()));
        ans.add(preOrder(root, new ArrayList<>()));
        ans.add(postOrder(root, new ArrayList<>()));

        return ans;
    }
    public static List<Integer> inOrder(TreeNode node, List<Integer> list) {
        if(node == null) return list;
        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);
        return list;
    }
    public static List<Integer> preOrder(TreeNode node, List<Integer> list) {
        if(node == null) return list;
        list.add(node.data);
        preOrder(node.left, list);
        preOrder(node.right, list);
        return list;
    }
    public static List<Integer> postOrder(TreeNode node, List<Integer> list) {
        if(node == null) return list;
        postOrder(node.left, list);
        postOrder(node.right, list);
        list.add(node.data);
        return list;
    }
}
