package MY_DSA.Leet;

public class Leet042 {
    public int trap(int[] height) {
        int count=0 , len=height.length;
        int[] right=new int[len];
        int[] left=new int[len];
        int highr=height[0];
        int highl=height[len-1];
        for(int i=0;i<len;i++){
            highr=Math.max(highr,height[i]);
            highl=Math.max(highl,height[(len-1)-i]);
            right[i]= highr;
            left[(len-1)-i]=highl;
        }
        for(int i=0;i<len;i++){
            count+=(Math.min(right[i],left[i])-height[i]);
        }
        return count;
    }
}
