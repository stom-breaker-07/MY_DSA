package MY_DSA.Leet;

public class Leet942 {
    public int[] diStringMatch(String s) {
        char []sChars = s.toCharArray();
        int n= sChars.length;
        int low =0;
        int high = sChars.length;
        int [] result = new int[n+1];
        for(int i=0;i<n;i++){
            if(sChars[i] == 'I'){
                result[i] = low++;
            }
            else {
                result[i] = high--;
            }

        }
        result[n]=low;

        return result;
    }
}

/*A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.



Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]*/