class Solution:
    def jump(self, nums: List[int]) -> int:
        Maxidx=0
        Jump=0
        end=0
        for i in (len(nums)-1):
            Maxidx=max(Maxidx,i+nums[i])
            if i == end:
                Jump+=1
                end=Maxidx
        return Jump