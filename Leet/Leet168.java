package MY_DSA.Leet;

public class Leet168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int cur=columnNumber%26;
            ans.append((char)('A'+cur));
            columnNumber/=26;
        }
        return ans.reverse().toString();
    }
}

/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
 */
