package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet3819 {
        public int[] rotateElements(int[] nums, int k) {
            int len=nums.length;
            int Idx=0,Possize=0;
            ArrayList<Integer> pos=new ArrayList<>();
            for(int num :nums){
                if(num>=0){
                    pos.add(num);
                }
            }
            Possize=pos.size();
            if(k==0 || Possize==0 ) return nums;
            Idx=k%Possize;
            for(int i=0;i<len;i++){
                if(nums[i]>=0){
                    nums[i]=pos.get(Idx++ % Possize);
                }
            }
            return nums;
        }
}
