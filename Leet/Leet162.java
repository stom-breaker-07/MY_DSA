package MY_DSA.Leet;

public class Leet162 {
    public int findPeakElement(int[] nums) {
        int len=nums.length;
        int max=Integer.MIN_VALUE,curr=0,maxIndex=0;
        for(int i=0;i<len;i++){
            curr=nums[i];
            if(curr>max){
                max=curr;
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
