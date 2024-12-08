package MY_DSA.ArrayList;

import java.util.ArrayList;

public class ArrayList02 {
    static void ArrDesend(ArrayList<Integer> a){
        int len=a.size();
        for(int i=len-1 ;i>0 ;i--){
            for(int j=1;j<=i;j++){
                if(a.get(j)>a.get(j-1)){
                    int temp =a.get(j);
                    a.set(j,a.get(j-1));
                    a.set(j-1,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList02 a2=new ArrayList02();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        a2.ArrDesend(arr);
        System.out.println(arr);
    }
}
