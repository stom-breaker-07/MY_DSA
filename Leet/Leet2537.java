package MY_DSA.Leet;

import java.util.HashMap;
import java.util.Map;

public class Leet2537 {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int l=0;
        long pcnt=0;
        long good=0;

        for(int r=0;r<n;r++){
            int freq=map.getOrDefault(nums[r],0);
            pcnt+=freq;
            map.put(nums[r],freq+1);
            while(pcnt>=k){
                good+=(n-r);
                int lfreq=map.get(nums[l]);
                pcnt-=(lfreq-1);
                if(lfreq==1){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l],lfreq-1);
                }
                l++;
            }
        }

        return good;
    }
}
/*
Input: nums = [1,1,1,1,1], k = 10
Output: 1
Explanation: The only good subarray is the array nums itself.
*/