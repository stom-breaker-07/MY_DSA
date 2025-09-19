package MY_DSA.Leet;

import java.util.LinkedList;
import java.util.List;

public class Leet707 {
    static List<Integer> ll;

    public void MyLinkedList() {
        ll=new LinkedList<>();
    }

    public int get(int index) {
        if(ll.size()>index && index>=0){
            return ll.get(index);
        }
        return -1;
    }

    public void addAtHead(int val) {
        ll.add(0,val);
    }

    public void addAtTail(int val) {
        ll.add(val);
    }

    public void addAtIndex(int index, int val) {
        if (index > ll.size()) {
            return;
        } else {
            ll.add(index, val);
        }
    }

    public void deleteAtIndex(int index) {
        if(ll.size()>index && index>=0){
            ll.remove(index);
        }
    }
}
