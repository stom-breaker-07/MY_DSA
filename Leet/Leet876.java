package MY_DSA.Leet;

public class Leet876 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode middleNode(ListNode head) {
            ListNode n=head;
            int cnt=0;
            while(n!=null){
                cnt++;
                n=n.next;
            }
            for(int i=0;i<cnt/2;i++){
                head=head.next;
            }

            return head;
        }
}

/*Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4,
 we return the second one.
 */