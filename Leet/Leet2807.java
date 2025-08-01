package MY_DSA.Leet;

public class Leet2807 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return GCD(y, x % y);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode current = newHead;
        ListNode prev = head;
        ListNode curr = head.next;

        current.next = new ListNode(prev.val);
        current = current.next;
        while (curr != null) {
            int value = GCD(prev.val, curr.val);
            current.next = new ListNode(value);
            current = current.next;
            current.next = new ListNode(curr.val);
            current = current.next;

            //moving the pointer here
            prev=prev.next;
            curr=curr.next;
        }
        return newHead.next;
    }
}
