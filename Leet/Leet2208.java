package MY_DSA.Leet;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leet2208 {
    public int halveArray(int[] nums) {
        double sum=0;
        int cnt=0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums){
            pq.add((double)num);
            sum+=num;
        }
        double half=sum / 2.0;
        while(sum - half>1e-6){
            double cur=pq.poll();
            double currh= cur/2;
            cnt++;
            pq.add(currh);
            sum-=(cur - currh);
        }
        return cnt;
    }
}
