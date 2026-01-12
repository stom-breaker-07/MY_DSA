package MY_DSA.CodeChef;

public class CCFindtheLengthoftheLinkedList {
    class Node extends CCdetectCycle.Node {
        int data;
        CCdetectCycle.Node next;
        Node(int d) {data = d; next = null; }
    }
    public static int getLength(Node head) {
        int count=0;
        Node Current=head;
        while(Current!=null){
            Current=Current.next;
            count++;
        }
        return count;
    }
}
