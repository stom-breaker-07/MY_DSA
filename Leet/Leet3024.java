package MY_DSA.Leet;

public class Leet3024 {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            if( nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
            if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]) return "isosceles";
            else return "scalene";
        }
        else return "none";
    }
}
