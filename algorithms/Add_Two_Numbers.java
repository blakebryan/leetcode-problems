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
        int curDig;
        boolean carry = false;
        ListNode result, curNode;

        curDig = l1.val + l2.val;
        if (curDig > 9) {
            carry = true;
            curDig = curDig % 10;
        }
        result = new ListNode(curDig);
        curNode = result;

        while (l1.next != null || l2.next != null) {
            curDig = 0;
            if (carry) {
                curDig = 1;
            }
            if (l1.next != null) {
                l1 = l1.next;
                curDig += l1.val;
            }
            if (l2.next != null) {
                l2 = l2.next;
                curDig += l2.val;
            }
            if (curDig > 9) {
                carry = true;
                curDig = curDig % 10;
            } else {
                carry = false;
            }
            curNode.next = new ListNode(curDig);
            curNode = curNode.next;
        }
        if (carry) {
            curNode.next = new ListNode(1);
            curNode = curNode.next;
        }
        return result;
    }
}