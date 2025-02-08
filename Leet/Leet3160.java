package MY_DSA.Leet;

import java.util.HashMap;

public class Leet3160 {
    public int[] queryResults(int limit, int[][] queries) {
        int ans[]=new int[queries.length];

        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> colorCnt=new HashMap<>();
        int cnt=0;

        for(int i=0;i<queries.length;i++){
            int ball=queries[i][0];
            int currcolor=queries[i][1];

            if(map.containsKey(ball)){
                int prev=map.get(ball);

                colorCnt.put(prev , colorCnt.get(prev)-1);
                if(colorCnt.get(prev)==0){
                    cnt--;
                    colorCnt.remove(prev);
                }
            }
            map.put(ball,currcolor);

            if(!colorCnt.containsKey(currcolor)){
                cnt++;
            }
            colorCnt.put(currcolor,colorCnt.getOrDefault(currcolor,0)+1);
            ans[i]=cnt;
        }
        return ans;
    }
}

/* 3160. Find the Number of Distinct Colors Among the Balls*/