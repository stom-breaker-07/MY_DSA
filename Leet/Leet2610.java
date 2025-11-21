package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int size=nums.length;
        int[] hashmap=new int[nums.length+1];
        for(int num:nums){
            hashmap[num]++;
        }
        while(size>0){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length+1;i++){
                if(hashmap[i]>0){
                    list.add(i);
                    hashmap[i]--;
                    size--;
                }
            }
            ans.add(list);
        }

        return ans;
    }
}
