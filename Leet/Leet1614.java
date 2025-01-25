package MY_DSA.Leet;

public class Leet1614 {
    public int maxDepth(String s) {
        int count=0,max=0;
        for(char i:s.toCharArray()){
            if(i=='(') count++;
            max=Math.max(max,count);
            if(i==')') count--;
        }
        return max;
    }
}

/*Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3
Explanation:
Digit 3 is inside of 3 nested parentheses in the string.*/