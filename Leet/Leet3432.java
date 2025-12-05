package MY_DSA.Leet;

public class Leet3432 {
    public int countPartitions(int[] nums) {
        int count=0,len=nums.length;
        // Prefix sum
        for(int i=1;i<len;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<len-1;i++){
            int partA= nums[i];
            int partB= nums[len-1]-nums[i];
            if(Math.abs(partA - partB)%2 ==0) count++;
        }
        return count;
    }
}
