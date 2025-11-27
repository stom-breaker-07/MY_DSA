package MY_DSA.Leet;

import java.util.Stack;

public class Leet739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stck.isEmpty() && temperatures[i]>temperatures[stck.peek()]){
                int idx=stck.pop();
                result[idx]=i-idx;
            }
            stck.push(i);
        }
        return result;
    }
}
