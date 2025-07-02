# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current=head
        ans=ListNode()
        a=ans
        s=0
        while current:
            if current.val!=0 :
                s+=current.val
            else:
                a.next=ListNode(s)
                a=a.next
                s=0
            current=current.next
        return ans.next.next