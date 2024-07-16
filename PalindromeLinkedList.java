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
       ListNode cur = head, prev = null;
       while(cur != null) {
        ListNode nextNode = cur.next;
        cur.next = prev;
        prev = cur;
        cur = nextNode;
       }
       return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = reverseList(slow.next);

        while(ptr2 != null) {
            if(ptr1.val != ptr2.val) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;
    }
}
