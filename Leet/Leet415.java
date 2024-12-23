package MY_DSA.Leet;

public class Leet415 {
    public String addStrings(String num1, String num2) {
        int len1=num1.length() ,len2=num2.length();
        StringBuilder ans=new StringBuilder();
        int i=len1-1 ,j=len2-1 ;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;
            int sum =n1+n2+carry;
            ans.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}

/*
Given two non-negative integers, num1 and num2 represented as string,
 return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library
for handling large integers (such as BigInteger). You must also not convert
the inputs to integers directly.


Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
*/
