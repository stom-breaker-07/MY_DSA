package MY_DSA.Leet;

public class Leet3833 {
    public int dominantIndices(int[] nums) {
        int count=0,len=nums.length;
        int[] rev=new int[len];
        rev[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--){
            rev[i]=rev[i+1]+nums[i];
        }
        for(int i=0;i<len-1;i++){
            if(nums[i]>(rev[i+1]/(len-(i+1)))){
                count++;
            }
        }
        return count;
    }

}
