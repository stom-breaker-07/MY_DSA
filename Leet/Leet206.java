package MY_DSA.Leet;

public class Leet206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode reverseList(ListNode head) {
            ListNode prev=null;
            ListNode curr=head;

            while(curr != null){
                ListNode N_node=curr.next;
                curr.next=prev;
                prev=curr;
                curr=N_node;
            }
            return prev;
        }
}
