package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet1441 {
    public List<String> buildArray(int[] target, int n) {
        int idx=0,v=1,len=target.length;
        List<String> res=new ArrayList<>();
        while(v<=n && idx<len){
            if(target[idx]==v){
                res.add("Push");
                idx++;
                v++;
            }else{
                res.add("Push");
                res.add("Pop");
                v++;
            }
        }
        return res;
    }
}
