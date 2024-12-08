package MY_DSA.Leet;

public class Leet485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int max=0 ,count=0;
        for(int i=0; i<len;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }

            if(count>max){
                max=count;
            }
        }
        return max;
    }

}
