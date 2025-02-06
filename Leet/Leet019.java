package MY_DSA.Leet;

public class Leet019 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first=head;
            for(int i=0;i<n;i++){
                first=first.next;
            }
            if(first==null){
                head=head.next;
                return head;
            }
            ListNode Secound=head;
            while(first.next!=null){
                first=first.next;
                Secound=Secound.next;
            }
            Secound.next=Secound.next.next;

            return head;
        }
}

/*Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]*/