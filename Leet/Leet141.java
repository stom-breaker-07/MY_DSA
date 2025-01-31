package MY_DSA.Leet;

public class Leet141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode sp = head;
        ListNode n = head;
        while(sp != null && sp.next != null){
            sp = sp.next.next;
            n = n.next;
            if(sp == n) return true;
        }
        return false;
    }
}

/*
141. Linked List Cycle
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list,
where the tail connects to the 1st node (0-indexed).*/