package MY_DSA.Leet;

public class Leet2873 {
    public long maximumTripletValue(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    long curr=(long)(nums[i]-nums[j])*nums[k];
                    max=Math.max(max,curr);
                }
            }
        }
        return max;
    }
}
/*Input: nums = [12,6,1,2,7]
Output: 77
Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
It can be shown that there are no ordered triplets of indices with a value greater than 77. */