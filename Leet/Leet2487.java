package MY_DSA.Leet;

public class Leet2487 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stk=new Stack<>();
        while(head!=null){
            while(!stk.isEmpty() && stk.peek()<head.val){
                stk.pop();
            }
            stk.push(head.val);
            head=head.next;
        }

        ListNode root=null;
        while(!stk.isEmpty()){
            ListNode Node=new ListNode(stk.pop());
            Node.next=root;
            root=Node;
        }
        return root;
    }
}
