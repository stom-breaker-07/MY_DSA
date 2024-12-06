package MY_DSA.Array;
import java.util.Arrays;

public class Missing_Number {
        public int missingNumber(int[] nums) {
            int result=nums.length ;
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    result = i;
                    break;
                }
            }
            return result ;
        }

}
