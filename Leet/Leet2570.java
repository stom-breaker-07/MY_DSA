package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length, n = nums2.length;
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();

        while(i < m && j < n){
            if(nums1[i][0] == nums2[j][0]){
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++; j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                result.add(nums1[i]);
                i++;
            }
            else{
                result.add(nums2[j]);
                j++;
            }
        }
        while(i < m){
            result.add(nums1[i]);
            i++;
        }
        while(j < n){
            result.add(nums2[j]);
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}

/*Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.
Example 2:

Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.*/