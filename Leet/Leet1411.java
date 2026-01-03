package MY_DSA.Leet;

public class Leet1411 {
    public int numOfWays(int n) {
        int Mod=1000000007;
        if(n==0)return 0;
        long two=6,three=6;
        n--;
        while(n>0){
            long nextTwo= (3*two + 2*three) % Mod;
            three=(2*two + 2*three)% Mod;
            two=nextTwo;
            n--;
        }
        return (int) (two+three)% Mod;
    }
}
