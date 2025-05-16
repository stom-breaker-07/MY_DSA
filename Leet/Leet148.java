package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Collections;

public class Leet148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode sortList(ListNode head) {
            ListNode node=head;
            ArrayList<Integer> arr=new ArrayList<>();

            while(node!=null){
                arr.add(node.val);
                node=node.next;
            }

            Collections.sort(arr);
            ListNode List=new ListNode(0);
            ListNode curr=List;
            for(int i=0;i<arr.size();i++){
                curr.next=new ListNode(arr.get(i));
                curr=curr.next;
            }

            return List.next;
        }

}
