//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> list = new ArrayList<>();
      addLeftView(root,list,0);
      return list;
    }
    void addLeftView(Node root,ArrayList<Integer> list,int level) {
        if(root == null) {
            return;
        }
        if(level == list.size()) list.add(root.data);
        addLeftView(root.left,list,level+1);
        addLeftView(root.right,list,level+1);
    }
}
