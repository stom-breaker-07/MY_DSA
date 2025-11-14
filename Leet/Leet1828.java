package MY_DSA.Leet;

public class Leet1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count=0,x1=queries[i][0],y1=queries[i][1] ,r=queries[i][2];
            for(int j=0;j<points.length;j++){
                int x2=points[j][0],y2=points[j][1];
                int dist=(int)Math.ceil(Math.sqrt(Math.pow((double)(x1-x2),2) + Math.pow((double)(y1-y2),2)));
                if(dist<=r){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}
