package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        Backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    static void Backtrack( List<List<Integer>> out, List<Integer> in ,int[] nums , int idx){
        if(idx==nums.length){
            if(!out.contains(in)){
                out.add(new ArrayList<>(in));
            }
            return;
        }
        in.add(nums[idx]);
        Backtrack(out,in,nums,idx+1);
        in.remove(in.size()-1);
        Backtrack(out,in,nums,idx+1);
    }
}
