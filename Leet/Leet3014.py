class Solution:
    def minimumPushes(self, word: str) -> int:
        cnt=0
        s=set()
        for i in word:
            if i not in s:
                s.add(i)

        l=len(s)
        while l>0:
            if l>24:
                cnt+=4

            elif l>16 and l<=24:
                cnt+=3

            elif l>8 and l<=16:
                cnt+=2

            else:
                cnt+=1

            l-=1

        return cnt