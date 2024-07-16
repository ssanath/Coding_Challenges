class GfG {
    Node mergeLists(Node a, Node b) {
        Node temp = new Node(0);
        Node res = temp;
        
        while(a != null && b != null) {
            if(a.data<b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.next;
            }
            else
            {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.next;
            }
        }
        
        if(a != null) temp.bottom = a;
        else temp.bottom = b;
        return res.bottom;
    }
    Node flatten(Node root) {
        if(root == null || root.next == null) {
            return root;
        }
        
        root.next = flatten(root.next);
        
        root = mergeLists(root,root.next);
        
        return root;
    }
}
