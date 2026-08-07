class Solution:

    def minimumCost(self, nums: list[int], k: int) -> int:
        Mod=10**9+7
        r=k
        cnt=0
        for i in nums:
            if r>=i:
                r-=i
            else:
                arr=self.firstprocess(i,r,cnt,k)
                r=arr[0]
                cnt=arr[1]
                r-=i

        cost=((cnt*(cnt+1))//2)%Mod
        return cost

    def firstprocess(self,value,r,cnt,k):
        ops = (value - r + k - 1) // k
        cnt += ops
        r += ops * k
        return [r,cnt]