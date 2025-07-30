package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet039 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result=new ArrayList<>();
            BackTrack(candidates,target,0,new ArrayList<>(),result,0);
            return result;
        }


        static void BackTrack(int[] arr,int target,int currentSum,List<Integer> current,List<List<Integer>> ans,int idx){
            if(idx>=arr.length || currentSum>target) return ;

            if(currentSum==target){
                ans.add(new ArrayList<>(current));
                return;
            }
            current.add(arr[idx]);
            BackTrack(arr,target,currentSum+arr[idx],current,ans,idx);
            current.remove(current.size()-1);
            BackTrack(arr,target,currentSum,current,ans,idx+1);
        }
}
