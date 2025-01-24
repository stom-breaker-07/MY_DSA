package MY_DSA.LinkedList;

//From Apana Collage PlayLisT
//From Scratch:
public class LL01a {
    Node head;
    class Node{
        int Data;
        Node next;

        Node(int d){
            this.Data=d;
            this.next=null;
        }
    }

    private void AddFirst(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }

    private void AddLast(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=n;
    }

    private void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        else{
            Node n=head;
            while(n!=null){
                System.out.print(n.Data + " -> ");
                n=n.next;
            }
        }
        System.out.println("null");
    }

    private void DelFirst(){
        Node n=head;
        n=n.next;
        head=n;
    }

    private void DelLast(){
        if(head==null){
            System.out.println("List is Empty !");
        }
        if(head.next==null){
           head=null;
           return;
        }
        else{
            Node sn=head;
            while(sn.next.next!=null){
                sn=sn.next;
            }

            sn.next=null;
        }
    }

    public static void main(String[] args) {
        LL01a ll=new LL01a();//initialized a class here
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddLast(0);
        ll.AddLast(4);
        ll.AddLast(0);
        ll.AddLast(5);
        ll.AddLast(0);
        ll.print();

        ll.DelFirst();
        ll.print();

        ll.DelLast();
        ll.print();

    }
}
