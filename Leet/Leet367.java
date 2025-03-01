package MY_DSA.Leet;

public class Leet367 {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int i=1,j=num/2;
        while(i<=j){
            long mid=i+(j-i)/2;
            long sq=mid*mid;

            if(sq == num) return true;
            else if(sq > num) j=(int)mid-1;
            else i=(int)mid+1 ;
        }
        return false ;
    }
}

/*Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer.
 In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.



Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
*/