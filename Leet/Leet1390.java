package MY_DSA.Leet;

public class Leet1390 {
    static int getSumofDivisor(int num){
        int count=2;
        int value=num+1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count--;
                if(count>=0){
                    value+=i;
                }
                else{
                    return 0;
                }
            }
        }
        return (count==0)?value:0 ;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=getSumofDivisor(nums[i]);
        }
        return sum;
    }
}
