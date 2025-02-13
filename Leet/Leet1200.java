package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE ;

        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i+1]-arr[i];
            diff=Math.min(diff,curr);
        }

        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i+1]-arr[i];
            if(curr==diff){
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }
}
