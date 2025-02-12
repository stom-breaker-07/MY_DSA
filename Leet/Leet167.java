package MY_DSA.Leet;

public class Leet167 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length -1;
        while(i<j){
            int mid=numbers[i]+numbers[j];
            if(mid==target){
                return new int[] {i+1,j+1};
            }else if(mid > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {1,2};
    }
}
/*Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/