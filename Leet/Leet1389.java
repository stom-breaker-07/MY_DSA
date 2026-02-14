package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] tar=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<list.size();i++){
            tar[i]=list.get(i);
        }
        return tar;
    }
}
