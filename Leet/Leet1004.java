package MY_DSA.Leet;

public class Leet1004 {
        public int longestOnes(int[] nums, int k) {
            int len=nums.length;
            int numOf0=0 , maxlength=0, start=0;
            for(int i=0;i<len;i++){
                if(nums[i]==0){
                    numOf0++;
                }
                while(numOf0 > k){
                    if(nums[start]==0){
                        numOf0--;
                    }
                    start++;
                }
                maxlength=Math.max(maxlength,i-start + 1 );
            }

            return maxlength;
        }
}
