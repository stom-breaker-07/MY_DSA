package MY_DSA.Leet;

public class Leet202 {
    public boolean isHappy(int n) {
        if(n==1||n==7)return true;
        else if(n<10)return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+=temp*temp;
                n/=10;
            }
            return isHappy(sum) ;
        }
    }
}

/*Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false*/