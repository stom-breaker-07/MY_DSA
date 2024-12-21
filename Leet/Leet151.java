package MY_DSA.Leet;

public class Leet151 {
    public String reverseWords(String s) {
        int len=s.length();
        StringBuilder ans=new StringBuilder();
        int i=len-1;

        while(i >=0){
            StringBuilder in=new StringBuilder();
            if(s.charAt(i)!=' '){
                while(i >= 0 && s.charAt(i)!=' '){
                    in.append(s.charAt(i));
                    i--;
                }
                ans.append(in.reverse());
                ans.append(' ');
            }
            i--;
        }
        if (ans.length()>0 && ans.charAt(ans.length() - 1)==' ') {
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }
}

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.

Return a string of the words in reverse
order concatenated by a single space.

Note that s may contain leading or trailing spaces or multipl
spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
*/
