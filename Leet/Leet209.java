package MY_DSA.Leet;

public class Leet209 {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,end=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(end<nums.length){
            sum+=nums[end++];
            while(sum>=target){
                min=Math.min(min,end-start);
                sum-=nums[start++];
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}
