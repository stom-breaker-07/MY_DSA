class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if ch in word:
            idx=word.index(ch)+1
            s=word[0:idx]
            new=''.join(reversed(s))
            ans=new +  word[idx:]
            return ans
        return word
