package MY_DSA.Leet;

public class Leet3174 {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                if(sb.length()!=0){
                    sb.delete(sb.length()-1,sb.length());
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
/*Example 1:

Input: s = "abc"

Output: "abc"

Explanation:

There is no digit in the string.

Example 2:

Input: s = "cb34"

Output: ""

Explanation:

First, we apply the operation on s[2], and s becomes "c4".

Then we apply the operation on s[1], and s becomes "".

 */
