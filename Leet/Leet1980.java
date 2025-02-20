package MY_DSA.Leet;

public class Leet1980 {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                ans.append('1');
            }else{
                ans.append('0');
            }
        }
        return ans.toString();
    }
}
/*Example 1:

Input: nums = ["01","10"]
Output: "11"
Explanation: "11" does not appear in nums. "00" would also be correct.
Example 2:

Input: nums = ["00","01"]
Output: "11"
Explanation: "11" does not appear in nums. "10" would also be correct.
Example 3:

Input: nums = ["111","011","001"]
Output: "101"
Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.*/