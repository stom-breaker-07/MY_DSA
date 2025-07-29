package MY_DSA.Leet;

public class Leet2535 {
    public int differenceOfSum(int[] nums) {
        int sum=0,sumd=0;
        for(int i:nums){
            sum+=i;
            while(i>0){
                int curr=i%10;
                sumd+=curr;
                i/=10;
            }
        }
        return Math.abs(sum-sumd);
    }
}
