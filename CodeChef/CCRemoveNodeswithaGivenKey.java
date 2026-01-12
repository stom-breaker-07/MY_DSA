package MY_DSA.CodeChef;

public class CCRemoveNodeswithaGivenKey {
    class Node
    {
        int data;
        CCRemoveNodeswithaGivenKey.Node next;
        Node(int d) {data = d; next = null; }
    }
    static Node removeKey(Node head, int key) {
        Node ReturnHead=new Node(-1);
        ReturnHead.next=head;
        Node Prev=ReturnHead;
        while(head!=null){
            if(head.data==key){
                Node currentNext=head.next;
                Prev.next=currentNext;
            }else{
                Prev=head;
            }
            head=head.next;
        }
        return ReturnHead.next;
    }
}
