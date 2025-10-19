package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet260 {
    public int[] singleNumber(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int num : nums){
            if(!res.contains(num)){
                res.add(num);
            }
            else{
                res.remove((Integer) num);
            }
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}
