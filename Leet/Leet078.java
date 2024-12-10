package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet078 {
    public List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> out =new ArrayList<>();
        out.add(new ArrayList<>());
        for(int ele :arr){
            int size= out.size();
            for(int i=0;i<size;i++){
                List<Integer> in =new ArrayList<>(out.get(i));
                in.add(ele);
                out.add(in);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Leet078 l=new Leet078();
        int[] b={1,2,3};
        System.out.println(l.Subset(b));
    }
}
