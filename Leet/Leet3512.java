package MY_DSA.Leet;

public class Leet3512 {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int num:nums){
            count+=num;
        }
        return count%k;
    }
}
