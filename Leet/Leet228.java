package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            StringBuilder sb=new StringBuilder();
            int cur=nums[i];
            sb.append(cur);
            while(i+1<nums.length && nums[i+1] == nums[i]+1 ){
                i++;
            }
            if(nums[i] != cur){
                sb.append("->");
                sb.append(nums[i]);
            }
            ans.add(sb.toString());
            i++;
        }
        return ans;
    }
}
/*Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"


Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.*/