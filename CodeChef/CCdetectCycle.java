package MY_DSA.CodeChef;

public class CCdetectCycle {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public static Node detectCycle(Node head){
        Node Rabbit=head, Tortois=head;
        while(Tortois!=null && Rabbit!=null){
            Rabbit=Rabbit.next.next;
            Tortois=Tortois.next;
            if(Tortois==Rabbit){
                Tortois=head;
                while(Tortois!=Rabbit){
                    Tortois=Tortois.next;
                    Rabbit=Rabbit.next;
                }
                return Tortois;
            }
        }
        return null;
    }
}
