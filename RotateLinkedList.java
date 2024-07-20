/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next != null) {
            len++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % len;
        temp = head;
        for(int i=0;i<(len-k-1);i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}
