class Solution{
    Node removeDuplicates(Node head){
        if(head == null) return head;
        Node temp = head.next;
        while(temp != null) {
            if(temp.data == temp.prev.data) {
                temp.prev.next = temp.next;
                if(temp.next != null) temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
        return head;
        
    }
}
