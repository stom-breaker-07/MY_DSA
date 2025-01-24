package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        boolean[] used=new boolean[nums.length];

        Permutation(ans,in,used,nums);

        return ans;
    }

    private void Permutation( List<List<Integer>> out, List<Integer> in ,boolean[] use,int[] nums) {
        if (in.size() == nums.length) {
            out.add(new ArrayList<>(in));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (use[i]) continue;

            use[i] = true;
            in.add(nums[i]);

            Permutation(out, in, use, nums);

            in.remove(in.size() - 1);
            use[i] = false;
        }
    }
}

/*Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
*/
