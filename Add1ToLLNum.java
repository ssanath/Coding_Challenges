class Solution {
    public Node addOne(Node head) {
        Node newHead = reverse(head), prev = null;
        Node temp = newHead;
        int carry = 1;
        while(temp != null) {
            int val = temp.data + carry;
            carry = val/10;
            temp.data = val%10;
            prev = temp;
            temp = temp.next;
        }
        if(carry == 1) prev.next = new Node(1);
        return reverse(newHead);
    }
    public Node reverse(Node head) {
        Node currNode = head, prevNode = null;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}
