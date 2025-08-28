package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet040 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            Arrays.sort(candidates);
            backtrack(ans,new ArrayList<>(),candidates,target,0);
            return ans;
        }
        static void backtrack(List<List<Integer>> ans,List<Integer> inner,int[] candidates,int remain ,int idx){
            if(remain==0){
                ans.add(new ArrayList<>(inner));
                return ;
            }
            for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i]==candidates[i-1]) continue;
                if(candidates[i]>remain) break;

                inner.add(candidates[i]);
                backtrack(ans,inner,candidates,remain - candidates[i],i+1);
                inner.remove(inner.size()-1);
            }
        }
}
