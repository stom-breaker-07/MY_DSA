package MY_DSA.Leet;

public class Leet3467 {
    public int[] transformArray(int[] nums) {
        int count=0;
        int[] ans=new int[nums.length];
        for(int i:nums){
            if(i%2==0){
                count++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i < count){
                ans[i]=0;
            }else{
                ans[i]=1;
            }
        }
        return ans;
    }
}
