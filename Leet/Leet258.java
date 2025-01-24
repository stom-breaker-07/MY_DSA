package MY_DSA.Leet;

public class Leet258 {
    public int addDigits(int num) {
        return 1+(num-1)%9;
    }
}

/*Digital Root Concept

 The digital root of a number is the value obtained by repeatedly summing its digits until a single digit is reached. Mathematically:
For +ve numbers : Digital Root=1+(num−1)%9*

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 */
