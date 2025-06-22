class Solution:
    def specialTriplets(self, nums: List[int]) -> int:
        MOD = 10**9 + 7
        count = 0

        left_count = defaultdict(int)
        right_count = defaultdict(int)

        for num in nums:
            right_count[num] += 1

        # Iterate over `j` as the middle element
        for j in range(len(nums)):
            right_count[nums[j]] -= 1

            left_triplets = left_count[nums[j] * 2]
            right_triplets = right_count[nums[j] * 2]
            count += left_triplets * right_triplets
            count %= MOD

            left_count[nums[j]] += 1

        return count