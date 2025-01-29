package MY_DSA.Leet;

public class Leet083 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans=head;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return ans;
    }
}

/*Given the head of a sorted linked list,
delete all duplicates such that each element appears only once.
 Return the linked list sorted as well.
 */