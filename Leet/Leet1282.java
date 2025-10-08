package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int len=groupSizes.length;
        int Min=len,Max=0;
        List<List<Integer>> res=new ArrayList<>();

        for(int val : groupSizes){
            Max=Math.max(Max,val);
            Min=Math.min(Min,val);
        }

        for(int i=Min;i<=Max;i++){
            List<Integer> in=new ArrayList<>();
            for(int j=0;j<len;j++){
                if(groupSizes[j]==i){
                    in.add(j);
                }
                if(in.size()==i){
                    res.add(new ArrayList<>(in));
                    in.clear();
                }
            }
        }

        return res;
    }
}
