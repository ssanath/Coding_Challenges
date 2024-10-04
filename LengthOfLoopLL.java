class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        if(head == null || head.next == null) return 0;
        Node fast = head.next.next, slow = head;
        while(fast != null && fast.next != null) {
            if(slow == fast) return countLoopLength(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        return 0;
    }
    public int countLoopLength(Node meetingPoint) {
        int length = 1;
        Node temp = meetingPoint.next;
        while(temp != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
