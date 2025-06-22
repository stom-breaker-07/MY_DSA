class Solution:
    def generateTag(self, caption: str) -> str:
        tag=['#']
        words=caption.split()
        for i,word in enumerate(words):
            if i==0:
                tag.append(word.lower())
            else:
                tag.append(word.title())
        result = "".join(tag)

        return result[:100]