package MY_DSA.Leet;

public class Leet2221 {
        public int triangularSum(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            int[] newNums=new int[nums.length-1];
            for(int i=0;i<newNums.length;i++){
                newNums[i]=(nums[i]+nums[i+1])%10;
            }
            return triangularSum(newNums);
        }
}
