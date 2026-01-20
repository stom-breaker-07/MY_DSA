package MY_DSA.Leet;

public class Leet3314 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            int j=0,target=nums.get(i);
            while(j<target){
                if((j|(j+1))==target){
                    ans[i]=j;
                    break;
                }
                j++;
            }
            if(j==target) {
                ans[i]=-1;
            }
        }
        return ans;
    }
}
