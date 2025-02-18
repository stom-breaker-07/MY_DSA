package MY_DSA.Leet;

public class Leet1079 {
    public int numTilePossibilities(String tiles) {
        int[] alpha=new int[26];
        for(int i=0;i<tiles.length();i++){
            alpha[tiles.charAt(i) - 'A']++;
        }

        int[] f=new int[tiles.length()+1];
        f[0]=1;
        for(int i=1;i<f.length;i++){
            f[i]=i*f[i-1];
        }

        int[] lengths=new int[tiles.length() +1];
        lengths[0]=1;

        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=0){
                int[] arr=new int[tiles.length() +1];
                for(int j=0; j<lengths.length && lengths[j]>0 ; j++){
                    for(int k=1; k<= alpha[i] ; k++){
                        int total = j+k;
                        arr[total] += lengths[j] * f[total] /(f[k]*f[j]);
                    }
                }
                for(int j=0 ;j<arr.length   ;j++){
                    lengths[j]+=arr[j];
                }
            }
        }

        int ans=0;
        for(int i=1;i<lengths.length;i++){
            ans+=lengths[i];
        }

        return ans;
    }
}

/*You have n  tiles, where each tile has one letter tiles[i] printed on it.

Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.



Example 1:

Input: tiles = "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".*/