package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet3668 {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> Al=new ArrayList<>();
        for(int friend :friends){
            Al.add(friend);
        }

        for(int num:order){
            if(Al.contains(num)){
                ans.add(num);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
    }
}
