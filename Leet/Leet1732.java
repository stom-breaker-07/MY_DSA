package MY_DSA.Leet;

public class Leet1732 {
    public int largestAltitude(int[] gain) {
        int Max=0,current=0;
        for(int point : gain){
            current+=point;
            Max=Math.max(Max,current);
        }
        return Max;
    }
}
