package MY_DSA.CodeChef;

public class CCRemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        // write your code here...
        StringBuilder sb=new StringBuilder();
        int cnt=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(cnt>0){
                    sb.append('(');
                }
                cnt++;
            }
            else{
                if(cnt>1){
                    sb.append(')');
                }
                cnt--;
            }
        }
        return sb.toString();
    }
}
