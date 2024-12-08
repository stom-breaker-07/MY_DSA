package MY_DSA.ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public void revArrList(ArrayList<Integer> a){
        int i=0,j=a.size()-1;
        while(i<j){
            int temp =a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
       ArrayList01 a1=new ArrayList01();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        a1.revArrList(arr);
        System.out.println(arr);
    }

}
