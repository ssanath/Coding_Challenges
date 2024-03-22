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
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, curr = head, nex = null;
        while(curr != null)
        {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public ListNode getKthNode(ListNode temp, int k) {
        k -= 1;
        while(temp != null && k > 0)
        {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevLast = null;
        while(temp != null)
        {
            ListNode kThNode = getKthNode(temp,k);
            if(kThNode == null)
            {
                if(prevLast != null)
                {
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);
            if(head==temp)
            {
                head = kThNode;
            }
            else
            {
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}
