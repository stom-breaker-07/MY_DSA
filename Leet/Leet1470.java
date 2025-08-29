package MY_DSA.Leet;

public class Leet1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int aidx1=0,aidx2=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[aidx1++];
            }
            else{
                arr[i]=nums[aidx2++];
            }
        }
        return arr;
    }
}
