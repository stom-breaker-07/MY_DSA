package MY_DSA.Leet;

public class Leet005 {
    public String longestPalindrome(String s) {
        if(s==null || s.length() < 1) return "";
        int start=0,end=0;
        for(int i=0 ;i<s.length();i++){
            int len1=pal(s,i,i);
            int len2=pal(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>(end-start)){
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int pal(String a,int left,int right){
        while(left>=0 && right<a.length() && a.charAt(left)==a.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

}


/*
Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */