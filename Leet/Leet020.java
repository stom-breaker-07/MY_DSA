package MY_DSA.Leet;

import java.util.Stack;

public class Leet020 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.length() % 2 != 0) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if((c==')' && !stack.empty() && stack.peek()=='(') ||
                        (c=='}' && !stack.empty() && stack.peek()=='{') ||
                        (c==']' && !stack.empty() && stack.peek()=='[')){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
        }
        return stack.empty();
    }
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true


*/