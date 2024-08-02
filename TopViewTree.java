/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair {
    Node root;
    int hd;
    Pair(Node root, int hd) {
        this.root = root;
        this.hd = hd;
    }
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()) {
            Pair temp = queue.remove();
            int hd = temp.hd;
            Node node = temp.root;
            if(map.get(hd) == null) map.put(hd,node.data);
            if(node.left != null) {
                queue.add(new Pair(node.left,hd-1));
            }
            if(node.right != null) {
                queue.add(new Pair(node.right,hd+1));
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
