package MY_DSA.Leet;

public class Leet3208 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        if(k>n)return 0;
        int cnt=0,maxcnt=1;
        for(int i=1;i<=n+k-2;i++){
            if(colors[i % n] != colors[(i - 1 + n) % n]){
                maxcnt++;
            }else{
                maxcnt=1;
            }

            if(maxcnt >= k)cnt++;
        }
        return cnt;
    }
}

/*There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.*/
