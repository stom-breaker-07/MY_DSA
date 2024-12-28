package MY_DSA.LinkedList;

import java.util.LinkedList;

public class LL03 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.addLast(5);
        int a = list.indexOf(4);
        System.out.println(list);
        System.out.println(a);
        list.removeIf(x -> x%2==0);// only in remove if syntax:
        System.out.println(list);
    }
}
