package MY_DSA.Leet;

public class Leet1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minimum=0;
        int x1=points[0][0];
        int y1=points[0][1];
        for(int i=1;i<points.length;i++){
            int x2=points[i][0];
            int y2=points[i][1];
            int valx=Math.abs(x2-x1);
            int valy=Math.abs(y2-y1);
            minimum+=Math.max(valx,valy);
            x1=x2;
            y1=y2;
        }
        return minimum;
    }
}
