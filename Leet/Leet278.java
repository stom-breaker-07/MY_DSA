package MY_DSA.Leet;

public class Leet278 {
    private boolean isBadVersion(int m){
        return true;
    }
    public int firstBadVersion(int n) {
        int st=0 ,e=n;
        int bad=-1;
        while(st<=e){
            int m=st+(e-st)/2;
            if(isBadVersion(m)){
                e=m-1;
                bad=m;
            }else{
                st=m+1;
            }
        }
        return bad;
    }
}
/*Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.*/