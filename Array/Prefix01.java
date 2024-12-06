package MY_DSA.Array;

public class Prefix01 {
    static  int getPrifixsum(int[] arr ,int index){
        int ans =0;
        for(int i=0;i<=index ; i++){
            ans+=arr[i];

        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5};
        int ind = 4;
        System.out.println(getPrifixsum(nums,ind));
    }
}
