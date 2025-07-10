class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        stone_dict=Counter(stones)
        count=0
        for key in stone_dict:
            if key in jewels:
                count+=stone_dict[key]
        return count