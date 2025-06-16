class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        Prifix_cnt={0:1}
        ans=0
        curr_sum=0

        for i in range (len(nums)):
            curr_sum+=nums[i]

            if curr_sum - k in Prifix_cnt :
                ans+=Prifix_cnt[curr_sum - k]

            Prifix_cnt[curr_sum]=Prifix_cnt.get(curr_sum ,0)+1

        return ans