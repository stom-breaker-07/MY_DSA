package MY_DSA.Leet;

public class Leet061 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private int getlength(ListNode head){
        int count=0;
        ListNode n=head ;
        while(n != null){
            n=n.next;
            count++;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if( head==null || head.next==null || k==0) return head ;

        int len=getlength(head);
        int rotate=k% len ;

        if(rotate==0)return head;

        ListNode curr=head;
        for(int i=1 ; i<len-rotate;i++){
            curr=curr.next;
        }
        ListNode New=curr.next;
        curr.next=null;
        ListNode temp=New;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=head;

        return New;
    }
}

/*Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
*/