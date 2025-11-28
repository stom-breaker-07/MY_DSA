package MY_DSA.Leet;

public class Leet496 {
    static int getIndex(int[] arr,int val){
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stck=new Stack<>();
        int[] result=new int[nums2.length];
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            result[i]=-1;
            while(!stck.isEmpty() && nums2[i]>nums2[stck.peek()]){
                int idx=stck.pop();
                result[idx]=nums2[i];
            }
            stck.push(i);
        }
        for(int i=0;i<ans.length;i++){
            int index= getIndex(nums2,nums1[i]);
            ans[i]=result[index];
        }
        return ans;
    }
}
