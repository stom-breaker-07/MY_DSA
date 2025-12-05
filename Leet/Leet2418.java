package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        String[][] map=new String[n][2];
        for(int i=0;i<n;i++){
            map[i][0]=names[i];
            map[i][1]=Integer.toString(heights[i]);
        }
        Arrays.sort(map,(a, b) -> Integer.compare(Integer.parseInt(b[1]),Integer.parseInt(a[1])));
        for(int i=0;i<n;i++){
            names[i]=map[i][0];
        }
        return names;
    }
}
