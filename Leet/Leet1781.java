package MY_DSA.Leet;

public class Leet1781 {
    static int count;
    public void slide(String s, int start, int range) {
        int[] alph = new int[26];
        int Max = 0;
        for (int i = start; i < range; i++) {
            alph[s.charAt(i) - 'a']++;
        }
        for (int f : alph) {
            if (f > 0) {
                Max = Math.max(Max, f);
            }
        }
        int Min = Integer.MAX_VALUE;
        for (int f : alph) {
            if (f > 0) {
                Min = Math.min(Min, f);
            }
        }
        count += (Max - Min);
    }
    public int beautySum(String s) {
        count=0;
        for(int i=3;i<=s.length();i++){
            int j=0;
            while(j<=s.length()-i){
                int r=j+i;
                slide(s,j,r);
                j++;
            }
        }
        return count;
    }
}
