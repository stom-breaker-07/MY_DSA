class Solution:
    def possibleStringCount(self, word: str) -> int:
        count=1
        ch=word[0]
        l=len(word)

        i=1
        while i<l:
            if word[i]==ch:
                while word[i]==ch:
                    count+=1
                    i+=1
                    if i==l:
                        return count
            ch=word[i]
            i+=1
        return count