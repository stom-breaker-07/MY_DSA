package MY_DSA.Leet;

public class Leet003 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int len=s.length();
            String Substring="";
            int start =0;
            int max=0;
            for(int i=0;i<len;i++){
                char curr=s.charAt(i);
                if(Substring.indexOf(curr)!=-1){
                    start+=Substring.indexOf(curr)+1;
                    Substring=s.substring(start,i);
                }
                Substring+=curr;
                max=Math.max(max,Substring.length());
            }
            return max ;
        }
    }
}

//Given a string s, find the length of the longest
//substring
// without repeating characters.
//
//
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
