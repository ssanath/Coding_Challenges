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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1, val2, res=0, carry=0;
        ListNode head3, temp, node;
        temp = new ListNode();
        head3 = temp;
        while(l1 != null || l2 != null)
        {
            res = ((l1 != null)? l1.val:0) + ((l2 != null)? l2.val:0) + carry;
            carry = res/10;
            res = res%10;
            node = new ListNode(res,null);
            temp.next = node;
            temp = node;
            l1 = (l1 != null)? l1.next:null;
            l2 = (l2 != null)? l2.next:null;
        }
        if(carry != 0)
        {
            node = new ListNode(carry,null);
            temp.next = node;
            temp = node;
        }
        temp.next = null;
        head3 = head3.next;
        return head3;
    }
}
