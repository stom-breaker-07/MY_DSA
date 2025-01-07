package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet1408 {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int len =words.length;
        for(int i=0;i<len;i++){
            String prefix=words[i];
            for(int j=0;j<len;j++){
                if(i==j) continue;
                if(prefix.contains(words[j]) && ans.indexOf(words[j])==-1){
                    ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}

/*Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string



Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
*/
