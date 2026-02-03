package MY_DSA.Leet;

public class Leet3637 {
    public boolean isTrionic(int[] nums) {
        int points=0,i=1;
        boolean mark=false;
        while(i<nums.length){

            if(i<nums.length && nums[i-1]>nums[i]){
                return false;
            }

            while(i<nums.length && nums[i-1]<nums[i]){
                if(!mark){
                    mark=true;
                    points++;
                }
                i++;
            }

            while(i<nums.length && nums[i-1]>nums[i]){
                if(mark){
                    mark=false;
                    points++;
                }
                i++;
            }
            if(i<nums.length && nums[i-1]==nums[i]){
                return false;
            }
        }
        return points==3;
    }
}
