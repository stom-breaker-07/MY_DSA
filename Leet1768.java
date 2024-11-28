package MY_DSA;

public class Leet1768 {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int i=0 ,j=0;
        StringBuilder ans=new StringBuilder();
        while(i<a || j<b){
            if(i<a){
                ans.append(word1.charAt(i));
                i++;
            }
            if(j<b){
                ans.append(word2.charAt(j));
                j++;
            }
        }


        return ans.toString();
    }
}

//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
//Example 3:
//
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//        word1:  a   b   c   d
//word2:    p   q
//merged: a p b q c   d
