package MY_DSA.Array;
import java.util.Arrays;
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                result=true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {4,1,2,1,2};
        Contains_Duplicate cd=new Contains_Duplicate();
        System.out.println(cd.containsDuplicate(num));

    }
}
