package MY_DSA;

public class isBalenced {
    public boolean isBalanced(String num) {
        boolean isBal;
        int odd =0;int even=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i) - '0';
            if(i % 2==0){
                even += digit;
            }
            else{
                odd += digit;
            }
        }
        if(even==odd){
            isBal=true;
        }else{
            isBal=false;
        }
        return isBal;
    }
}

//Example 1:

//Input: num = "1234"

//Output: false

//Explanation:

//The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
//Since 4 is not equal to 6, num is not balanced.


//Example 2:

//Input: num = "24123"

//Output: true

//Explanation:

//The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
//Since both are equal the num is balanced.

