package MY_DSA.Leet;

import java.util.Arrays;

public class Leet3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int Totalpack=0;
        int m=capacity.length;
        for(int num :apple){
            Totalpack+= num;
        }
        Arrays.sort(capacity);
        int idx=m-1;
        while(idx >=0 && Totalpack>0){
            Totalpack-=capacity[idx--];
        }
        return m-(idx+1);
    }
}
