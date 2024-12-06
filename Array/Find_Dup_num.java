package MY_DSA.Array;
import java.util.Arrays;
public class Find_Dup_num {
        public int findDuplicate(int[] nums) {
            int i=0;
            Arrays.sort(nums);
            for(i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    break;
                }
            }
            return nums[i];
        }
}
