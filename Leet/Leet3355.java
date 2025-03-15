package MY_DSA.Leet;

public class Leet3355 {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int len =nums.length;
        int[] diff=new int[len+1];

        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int end=queries[i][1];
            diff[st]+=1;
            diff[end+1]-=1;
        }
        for(int i=1;i<diff.length;i++){
            diff[i]+=diff[i-1];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>diff[i]){
                return false;
            }
        }

        return true;
    }
}
/*Example 1:

Input: nums = [1,0,1], queries = [[0,2]]

Output: true

Explanation:

For i = 0:
Select the subset of indices as [0, 2] and decrement the values at these indices by 1.
The array will become [0, 0, 0], which is a Zero Array.*/