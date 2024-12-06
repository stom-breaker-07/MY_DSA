package MY_DSA.Array;
import java.util.Arrays;

public class singleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i=0;i<nums.length-1;i+=2){
            if(nums[i] != nums[i+1]){
                break;
            }
        }
        return nums[i];
    }
    public static void main(String[] args) {
        int[] num = {4,1,2,1,2};
        singleNumber sin=new singleNumber();
        System.out.println(sin.singleNumber(num));

    }
}
