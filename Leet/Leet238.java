package MY_DSA.Leet;

public class Leet238 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int Product=1,wp=1,cnt0=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                wp*=nums[i];
            }
            if(nums[i]==0){
                cnt0++;
            }
            Product*=nums[i];
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                answer[j]=(Product/nums[j]);
            }else if(nums[j]==0 && cnt0<2){
                answer[j]=wp;
            }
        }
        return answer;
    }
}
