package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet225 {
    List<Integer> list;

    public void MyStack() {
        list=new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
