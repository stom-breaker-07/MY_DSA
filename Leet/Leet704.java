package MY_DSA.Leet;

public class Leet704 {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int i=0,j=len-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                i=mid+1;
            }
            if(nums[mid]>target){
                j=mid-1;
            }
        }
        return -1;
    }

}

//Linear Search
//public int search(int[] nums, int target) {
//        int len=nums.length;
//        for(int i=0;i<len;i++){
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }

