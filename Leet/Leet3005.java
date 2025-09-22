package MY_DSA.Leet;

public class Leet3005 {
    public int maxFrequencyElements(int[] nums) {
        int count=0,Max=0;
        int[] hash=new int [101];
        for(int num:nums){
            hash[num]++;
            Max=Math.max(hash[num],Max);
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==Max){
                count+=Max;
            }
        }
        return count;
    }
}
