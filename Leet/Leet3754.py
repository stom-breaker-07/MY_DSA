class Solution:
    def sumAndMultiply(self, n: int) -> int:
        sum=0
        x=0
        rev=0
        while n>0:
            t=n%10
            sum+=t
            if t!=0:
                rev=(rev*10)+t
            n//=10

        while rev>0:
            t=rev%10
            x=(x*10)+t
            rev//=10

        return x*sum