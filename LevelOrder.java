import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root == null) return wrapList;
        queue.add(root);
        while(!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i=0;i<num;i++) {
                if(queue.peek().left != null) {queue.add(queue.peek().left);}
                if(queue.peek().right != null) {queue.add(queue.peek().right);}
                sublist.add(queue.poll().val);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}
