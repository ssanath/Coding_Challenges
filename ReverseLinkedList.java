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
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode currNode = head.next;
        if(currNode == null)
        {
            return head;
        }
        ListNode nextNode = currNode.next;
        ListNode prevNode = head;
        prevNode.next = null;
        while(true)
        {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            if(currNode == null)
            {
                break;
            }
            nextNode = nextNode.next;
        }
        head = prevNode;
        return head;
    }
}
