class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        first=None
        Last=None
        current=head
        length=0

        while current:
            length+=1
            if length==k:
                first=current
            current=current.next

        target=length-k + 1
        current=head
        idx=1

        while current:
            if idx==target:
                Last=current
                break
            idx+=1
            current=current.next

        if first and Last :
            first.val,Last.val=Last.val,first.val

        return head