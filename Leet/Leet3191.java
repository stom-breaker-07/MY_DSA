package MY_DSA.Leet;

public class Leet3191 {
    static void flip(int[] arr,int i){
        arr[i]^=1;
        arr[i+1]^=1;
        arr[i+2]^=1;
    }
    public int minOperations(int[] nums) {
        int cnt=0,len=nums.length;
        for(int i=0;i<=len-3;i++){
            if(nums[i]==0){
                flip(nums,i);
                cnt++;
            }
        }
        if(nums[len-2]==0 || nums[len-1]==0){
            return -1;
        }
        return cnt;
    }
}

/*Input: nums = [0,1,1,1,0,0]

Output: 3

Explanation:
We can do the following operations:

Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].*/