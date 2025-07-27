package MY_DSA.Leet;

public class Leet2210 {
    public int countHillValley(int[] nums) {
        int count=0;
        int i=1;
        int lastidx=nums.length-1;
        while(i<lastidx){
            int left=i-1;
            int right=i+1;
            while(left>0 && nums[left]==nums[i]){
                left--;
            }
            while(right<lastidx && nums[right]==nums[i]){
                right++;
            }
            if(nums[left]<nums[i] && nums[i]>nums[right]){
                count++;
            }
            else if(nums[left]>nums[i] && nums[i]<nums[right]){
                count++;
            }
            i=right;
        }
        return count;
    }
}
