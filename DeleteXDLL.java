class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == x) {
                if(temp == head) {
                    head = temp.next;
                    if(temp.next != null) temp.next.prev = temp.prev;
                    if(temp.prev != null) temp.prev.next = temp.next;
                }
                else {
                    if(temp.next != null) temp.next.prev = temp.prev;
                    if(temp.prev != null) temp.prev.next = temp.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
