package MY_DSA.Leet;

public class Leet1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=k;
        for(int num :nums){
            if(num==1){
                if(cnt<k){
                    return false;
                }
                cnt=0;
            }
            else{
                cnt++;
            }
        }
        return true;
    }
}
