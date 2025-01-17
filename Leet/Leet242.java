package MY_DSA.Leet;

import java.util.Arrays;

public class Leet242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        int[] alp=new int[26];
        int[] ana=new int[26];
        for(char c:s.toCharArray()){
            alp[c -'a']++;
        }
        for(char c:t.toCharArray()){
            ana[c -'a']++;
        }
        return Arrays.equals(alp,ana);
    }
}

/*Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true*/