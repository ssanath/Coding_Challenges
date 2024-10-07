class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node zeroHead = new Node(-1);
        Node temp0 = zeroHead;
        Node oneHead = new Node(-1);
        Node temp1 = oneHead;
        Node twoHead = new Node(-1);
        Node temp2 = twoHead;
        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                temp0.next = temp;
                temp0 = temp0.next;
            }
            else if(temp.data == 1) {
                temp1.next = temp;
                temp1 = temp1.next;
            }
            else {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp1.next = twoHead.next;
        temp0.next = oneHead.next;
        temp2.next = null;
        return zeroHead.next;
    }
}
