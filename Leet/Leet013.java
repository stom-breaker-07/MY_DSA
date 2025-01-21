package MY_DSA.Leet;

import java.util.HashMap;

public class Leet013 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> r=new HashMap<>();
        r.put('I',1);
        r.put('V',5);
        r.put('X',10);
        r.put('L',50);
        r.put('C',100);
        r.put('D',500);
        r.put('M',1000);

        int sum=r.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            if(r.get(s.charAt(i)) < r.get(s.charAt(i+1))){
                sum-=r.get(s.charAt(i));
            }
            else{
                sum+=r.get(s.charAt(i));
            }
        }
        return sum;
    }
}

/*Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].*/