package MY_DSA.Leet;

public class Leet2226 {
    public int maximumCandies(int[] candies, long k) {
        int i=1 ,j=getMax(candies),ans=0;
        while(i<=j){
            int mid=i +(j - i)/ 2;
            if(canDistribute(candies,k,mid)){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
    static int getMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    static int getTotal(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    private boolean canDistribute(int[] candies, long k, int val) {
        long count = 0;
        for (int c : candies) {
            count += c / val;
            if (count >= k) return true;
        }
        return false;
    }
}
/*2226. Maximum Candies Allocated to K Children*/