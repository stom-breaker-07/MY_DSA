package MY_DSA.Leet;

public class Leet021 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n=new ListNode(0);
        ListNode curr=n;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next =list2;
                list2= list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return n.next;
    }
}

/*Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]*/