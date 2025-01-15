package MY_DSA.Leet;

public class Leet1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder sf=new StringBuilder();
        int count=0;
        for(char i:s.toCharArray()){
            if(i =='('){
                if(count>0){
                    sf.append(i);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sf.append(i);
                }
            }
        }
        return sf.toString();
    }
}

/*Input: s = "(()())(())"
Output: "()()()"
Explanation:
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
*/
