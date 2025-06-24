class Solution:
    def isPrime(self, n: int) -> bool:
        if n <= 1:
            return False
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                return False
        return True

    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        freq = Counter(nums)
        for count in freq.values():
            if self.isPrime(count):
                return True
        return False