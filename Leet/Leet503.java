package MY_DSA.Leet;

import java.util.Arrays;
import java.util.Stack;

public class Leet503 {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int[] mono=new int[len];
        Arrays.fill(mono,-1);

        Stack<Integer> stack=new Stack<>();

        for(int i=0; i < 2*len ;i++){
            while(!stack.isEmpty() && nums[i%len]>nums[stack.peek()]){
                int idx=stack.pop();
                mono[idx]=nums[i%len];
            }
            stack.push(i%len);
        }

        return mono;
    }
}
