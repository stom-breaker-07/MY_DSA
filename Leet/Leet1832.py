import set
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return set("abcdefghijklmnopqrstuvwxyz").issubset(set(sentence))