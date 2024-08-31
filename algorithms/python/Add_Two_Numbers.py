# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        digit = 1
        total = l1.val + l2.val
        while (l1.next):
            l1 = l1.next
            total += l1.val * (10 ** digit)
            digit += 1
        digit = 1
        while (l2.next):
            l2 = l2.next
            total += l2.val * (10 ** digit)
            digit += 1
        curNode = ListNode(0, None)
        ret = curNode
        while (total > 0):
            curNode.val = total % 10
            total = total // 10
            if (total > 0):
                curNode.next = ListNode(0, None)
                curNode = curNode.next
        return ret