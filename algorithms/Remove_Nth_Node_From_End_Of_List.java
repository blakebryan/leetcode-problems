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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 1;
        ListNode cur = head;

        while (cur.next != null) {
            cur = cur.next;
            length++;
        }
        if (length == n) {
            return head.next;
        }
        if (length == 1) {
            return null;
        }
        cur = head;
        for (int i = 0; i < length - n - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}