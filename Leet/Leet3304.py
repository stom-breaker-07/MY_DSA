class Solution:
    def kthCharacter(self, k: int) -> str:
        s=['a']
        while len(s)<k+1:
            add=[]
            for i in s:
                add.append(chr(ord(i)+1))
            s+=add
        return s[k-1]