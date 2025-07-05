class Solution:
    def findLucky(self, arr: List[int]) -> int:
        result=Counter(arr)
        MaxFreq=-1
        for key in result:
            if key == result[key]:
                MaxFreq=max(MaxFreq,key)
        return MaxFreq