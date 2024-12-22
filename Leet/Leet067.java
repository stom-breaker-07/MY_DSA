package MY_DSA.Leet;

public class Leet067 {
    public String AddBinary(String a,String b){
        int len1=a.length(),len2=b.length();
        int i=len1-1,j=len2-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        if(i>=0 || j>=0 || carry>0){
            int bit1=(i>=0)?a.charAt(i)-'0':0;
            int bit2=(j>=0)?b.charAt(j)-'0':0;
            int res=bit1+bit2+carry;
            ans.append(res%2);
            carry=res/2;
        }
        return ans.reverse().toString();
    }
}

/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/
