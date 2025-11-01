package MY_DSA.Leet;

import java.util.HashSet;

public class Leet3217 {
   public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num :nums) set.add(num);

        ListNode Listhead=new ListNode(0);
        ListNode tail=Listhead;
        while(head != null){
            if(!set.contains(head.val)){
                tail.next = new ListNode(head.val);
                tail=tail.next;
            }
            head=head.next;
        }
        return Listhead.next;
    }
}
