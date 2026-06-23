class Solution:

    def getRevInt(self,x:int) -> int:
        rev=0
        while(x>0):
            temp=x%10
            rev=(rev*10)+temp
            x//=10
        return rev

    def mirrorDistance(self, n: int) -> int:
        m=self.getRevInt(n)
        return abs(n-m)