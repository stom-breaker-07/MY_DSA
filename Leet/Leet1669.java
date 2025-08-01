package MY_DSA.Leet;

public class Leet1669 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;


        for(int i=1; i<a; i++){
            first = first.next;

        }
        ListNode second = list1;
        for(int i=0; i<b; i++){
            second = second.next;
        }
        ListNode tail = list2;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = second.next;
        first.next = list2;
        return list1;


    }
}
