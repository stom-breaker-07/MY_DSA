# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        current=head
        result=0
        while current:
            result = result*10 + current.val
            current=current.next
        return int(str(result),2)