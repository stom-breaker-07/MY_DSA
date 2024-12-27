package MY_DSA.Leet;

public class Leet028 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        if(needle.length()>haystack.length())return-1;
        else{
            for(int i=0;i<=haystack.length()-needle.length();i++){
                StringBuilder n=new StringBuilder();
                for(int j=i; j<i+needle.length() ; j++){
                    n.append(haystack.charAt(j));
                }
                if(needle.equals(n.toString())){
                    return i;
                }
            }
        }

        return -1;
    }
}

/*
    but use this
public int strStr(String haystack, String needle) {
    int h = haystack.length();
    int n = needle.length();
    for(int i=0; i<=h-n; i++){
        if(haystack.substring(i,i+n).equals(needle)){
            return i;
        }
    }
    return -1;
}
*/

/*
*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.*/
