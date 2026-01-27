package MY_DSA.Leet;

import java.util.List;

public class Leet3315 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            int a=nums.get(i);
            int b=a+1;
            if(a==2){
                ans[i]=-1;
            }
            else{
                ans[i]= a-((b)&(-b))/2;
            }
        }
        return ans;
    }
}
