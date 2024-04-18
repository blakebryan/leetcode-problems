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
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head, next = null, prev = null;
        if (cur != null) {
            next = cur.next;
        }
        if (next != null) {
            head = next;
        }
        while (next != null) {
            cur.next = next.next;
            next.next = cur;
            if (prev != null) {
                prev.next = next;
            }
            prev = cur;
            cur = cur.next;
            if (cur == null) {
                break;
            }
            next = cur.next;
        }
        return head;
    }
}