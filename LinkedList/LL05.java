package MY_DSA.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LL05 {

    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>(Arrays.asList(2,4,3));
        LinkedList<Integer> l2=new LinkedList<>(Arrays.asList(5,6,4));

        LinkedList<Integer> Listnode=new LinkedList<>();
        int s1=l1.size();
        int s2=l2.size();
        int i=s1-1 ,j=s2-1,carry=0;

        while (i>=0 || j>=0 || carry>0){
            int bit1=(i>=0)?l1.get(i):0;
            int bit2=(j>=0)?l2.get(j):0;
            int sum =bit1+bit2+carry;
            int num=sum%10;
            carry=sum/10;
            Listnode.add(num);
            i--;
            j--;
        }
        System.out.println(Listnode.stream().toList());
    }
}
