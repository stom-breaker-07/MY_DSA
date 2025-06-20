class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        result=0
        for char in set(s):
            first=s.find(char)
            last=s.rfind(char)

            if last-first > 1:
                unique_middles=set(s[first+1:last])
                result+=len(unique_middles)
        return result