package MY_DSA.Leet;

public class Leet002 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode initial=new ListNode(0);
        ListNode curr=initial;
        int carry=0;

        while (l1 != null || l2 != null || carry>0){
            int bit1=(l1 !=null)?l1.val:0;
            int bit2=(l2 !=null)?l2.val:0;
            int sum =bit1+bit2+carry;
            int num=sum%10;
            carry=sum/10;
            curr.next=new ListNode(num);
            curr=curr.next;
            l1= (l1 !=null)? l1.next:null;
            l2= (l2 !=null)? l2.next:null;
        }
        return initial.next;
    }
}
