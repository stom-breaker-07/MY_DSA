package MY_DSA.Leet;

public class Leet2379 {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int ans=0,min=k;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                ans++;
            }
        }
        if(n == 1)return ans;

        if(min>ans){
            min=ans;
        }

        for(int i=1; i<=n-k; i++){
            if(blocks.charAt(i-1)=='W'){
                ans--;
            }
            if(blocks.charAt(i+k -1)=='W'){
                ans++;
            }
            if(min>ans){
                min=ans;
            }
        }

        return min;
    }
}

/*Example 1:

Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW".
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
Example 2:

Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.*/