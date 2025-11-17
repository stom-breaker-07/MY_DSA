package MY_DSA.CodeChef;

public class CCMINToMAX {
    public int countNonMinimum(int[] nums) {
        int[] hashset=new int[100];
        int cnt=0,first=nums[0];
        for(int num:nums){
            if(num!=first){
                cnt++;
            }
            hashset[num-1]++;

        }
        int i=0;
        while(hashset[i]==0){
            i++;
        }
        return (cnt<1)?0:Math.abs(nums.length-hashset[i]);
    }
}
