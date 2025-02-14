package MY_DSA.Leet;

import java.util.PriorityQueue;

public class Leet3066 {
    public int minOperations(int[] nums, int k) {
        int cnt=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if(num<k) pq.add(num);
        }
        while(!pq.isEmpty()){
            int f=pq.poll();
            cnt++;
            if(pq.isEmpty()) break;
            int s=pq.poll();
            long sum=2l*f+s;
            if(sum < k) pq.add((int)sum);
        }
        return cnt;
    }
}
