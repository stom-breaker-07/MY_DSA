package MY_DSA.Leet;

public class Leet3264 {
    static int Minvalue(int[] nums){
        int max=nums[0],value=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                value=i;
                max=nums[i];
            }
        }
        return value;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int idx=Minvalue(nums);
            nums[idx]*=multiplier;
            k--;
        }
        return nums;
    }
}
