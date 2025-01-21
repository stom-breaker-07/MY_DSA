package MY_DSA.Leet;

import java.util.HashMap;

public class Leet451 {
    public String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(!map.isEmpty()){
            char maxC=' ';
            int max=0;
            for(char key:map.keySet()){
                if(map.get(key) > max){
                    maxC=key;
                    max=map.get(key);
                }
            }
            while(max>0){
                ans.append(maxC);
                max--;
            }
            map.remove(maxC);
        }

        return ans.toString();
    }
}

/*Given a string s, sort it in decreasing order based on the frequency of the characters.
 The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
*/
