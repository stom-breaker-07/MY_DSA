package MY_DSA.Leet;

public class Leet2698 {
    public int punishmentNumber(int n) {
        long res=0;
        int cur=1;
        while(cur<=n){
            if(valid(cur,cur*cur)){
                res+=cur*cur;
            }
            cur++;
        }
        return (int) res;
    }

    private boolean valid(int num,int sq){
        if(num==sq){
            return true;
        }
        else if (sq < num || num < 0) {
            return false;
        }
        int val=0;
        int un=1;
        while(sq>10){
            val+=sq%10 * un ;
            if(valid(num-val,sq/10)){
                return true;
            }
            sq/=10;
            un*=10;
        }
        return false;
    }
}
/*Example 1:

Input: n = 10
Output: 182
Explanation: There are exactly 3 integers i in the range [1, 10] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum equal to 8 + 1 == 9.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a sum equal to 10 + 0 == 10.
Hence, the punishment number of 10 is 1 + 81 + 100 = 182
Example 2:

Input: n = 37
Output: 1478
Explanation: There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1.
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0.
- 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478*/