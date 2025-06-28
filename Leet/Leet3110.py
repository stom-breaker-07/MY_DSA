class Solution:
    def scoreOfString(self, s: str) -> int:
        n = len(s)
        x = 0
        for i in range(n-1):
            x += abs(ord(s[i]) - ord(s[i+1]))

        return x