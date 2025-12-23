package MY_DSA.Leet;

import java.util.List;

public class Leet3349 {
    static boolean isIncresing(List<Integer> nums , int start, int end){
        for(int i=start;i<end;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2*k; i++) {
            if( isIncresing(nums,i,i+(k-1)) && isIncresing(nums,i+k,i+k+(k-1))){
                return true;
            }
        }
        return false;
    }
}
