package MY_DSA.Leet;
import java.util.Set;
import java.util.HashSet;

public class Leet2062 {
    public int countVowelSubstrings(String word) {
        int ans=0,len=word.length();
        if(len<5)return 0;

        for(int i=0;i<=len-5;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<len;j++){
                char c=word.charAt(j);
                if("aeiou".indexOf(c)==-1)break;
                set.add(c);
                if(set.size()==5)ans++;
            }
        }
        return ans;
    }
}

/*2062. Count Vowel Substrings of a String
Solved
Easy
Topics
Companies
Hint
A substring is a contiguous (non-empty) sequence of characters within a string.

A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.

Given a string word, return the number of vowel substrings in word.



Example 1:

Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"*/