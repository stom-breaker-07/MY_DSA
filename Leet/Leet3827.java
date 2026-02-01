package MY_DSA.Leet;

public class Leet3827 {
    public int countMonobit(int n) {
        int cnt=0,i=0;
        while(i<=n){
            i=(i*2)+1;
            cnt++;
        }
        return cnt;
    }
}
