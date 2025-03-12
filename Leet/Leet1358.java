package MY_DSA.Leet;

public class Leet1358 {
    class Solution {
        public int numberOfSubstrings(String s) {
            char[] charArr=s.toCharArray();
            int[] abc=new int[3];
            for(int i=0;i<3;i++){
                abc[i]=-1;
            }
            int start=0,cnt=0;
            while(start<charArr.length){
                abc[charArr[start] - 'a']=start;
                int min=Integer.MAX_VALUE;
                for(int i=0;i<3;i++){
                    min=Math.min(min,abc[i]);
                }
                cnt+=(min+1);
                start++;
            }
            return cnt;
        }
    }
}

/*Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least
 one occurrence of all these characters a, b and c.



Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab",
 "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).*/