package MY_DSA.Leet;

import java.util.Arrays;
import java.util.HashMap;

public class Leet506 {
    public String[] findRelativeRanks(int[] score) {
        int[] s=new int[score.length];
        for(int i=0;i<score.length;i++){
            s[i]=score[i];
        }
        Arrays.sort(s);
        for (int i=0; i<s.length/2;i++) {
            int temp=s[i];
            s[i] = s[s.length-i-1];
            s[s.length- i-1] = temp;
        }

        HashMap<Integer, String> a = new HashMap<>();
        for (int i=0; i<s.length; i++) {
            if (i==0) {
                a.put(s[i], "Gold Medal");
            } else if (i==1) {
                a.put(s[i], "Silver Medal");
            } else if (i==2) {
                a.put(s[i], "Bronze Medal");
            } else {
                a.put(s[i], String.valueOf(i + 1));
            }
        }
        String[] ans=new String[score.length];

        for(int i=0;i<score.length;i++){
            ans[i]=a.get(score[i]);
        }
        return ans;
    }
}

/*Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
*/