package MY_DSA.CodeChef;

public class CCchecksorted {
    public static boolean check(int[] nums) {
        // write your code here
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                cnt++;
            }
        }
        return cnt<2?true:false;
    }
}
