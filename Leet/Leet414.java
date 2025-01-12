package MY_DSA.Leet;

public class Leet414 {
    public int thirdMax(int[] nums) {
        Integer f=null ,s=null ,t=null ;
        for(int num : nums){
            if ((f != null && num==f)||(s!= null && num ==s)||(t!=null && num ==t))continue;

            if(f==null || num>f){
                t=s;
                s=f;
                f=num;
            }
            else if(s==null || num>s){
                t=s;
                s=num;
            }
            else if(t==null || num>t){
                t=num;
            }
        }
        return t==null?f:t;
    }
}

/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.*/
