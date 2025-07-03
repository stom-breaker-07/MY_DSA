class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        a=[]
        c=0
        for i in pref:
            l=c^i
            a.append(l)
            c=i
        return a