package MY_DSA.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LL04 {
    public static void main(String[] args) {
        //To create an List on fly :
        LinkedList<String> Animals = new LinkedList<>(Arrays.asList("Cat","Dog","Tiger","lion","Rabbit"));
        Animals.add(2,"Donkey");
        System.out.println(Animals);
        LinkedList<String> Carnianimals= new LinkedList<>(Arrays.asList("lion","Tiger"));
        Animals.removeAll(Carnianimals);
        System.out.println(Animals);
    }

}
