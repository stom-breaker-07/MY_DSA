package MY_DSA.GfG_CodeCup;

public class GfG_01 {
    static int findFloor(int[] arr, int k) {
        int res=-1;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]<=k){
                res=i;
            }
        }
        return res;
    }
}
