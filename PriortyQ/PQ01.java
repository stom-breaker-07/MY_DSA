package MY_DSA.PriortyQ;

import java.util.*;

public class PQ01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        System.out.println("enter the element of  : ");
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            pq.offer(num);
        }
        System.out.print("printing the number :");
        while(!pq.isEmpty()){
            System.out.print(pq.poll());
        }

    }
}
