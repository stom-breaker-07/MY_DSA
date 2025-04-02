package MY_DSA.Leet;

import java.util.Arrays;

public class Leet1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a, b)-> Integer.compare(b[1],a[1]));
        int ans=0,empty=truckSize;
        for(int[] box:boxTypes){
            int size=box[0];
            int unit=box[1];
            if(empty>size){
                empty-=size;
                ans+=(size * unit);
            }else{
                ans += (empty * unit);
                return ans;
            }
        }
        return ans;
    }
}
