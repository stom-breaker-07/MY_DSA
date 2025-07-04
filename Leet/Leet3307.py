from typing import List

class Solution:
    def kthCharacter(self, k: int, operations: List[int]) -> str:
        # ── 1. figure out how many operations we actually need ───────────
        length = 1            # current string length (starts at "a")
        m = 0                 # count of useful operations
        for op in operations:
            length <<= 1      # each operation doubles the length
            m += 1
            if length >= k:   # we can stop once the string is long enough
                break

        # ── 2. walk *backwards* through those m operations ───────────────
        shift = 0             # total +1 shifts we encounter (mod 26)
        for idx in range(m - 1, -1, -1):     # idx = m‑1 … 0
            half = 1 << idx                  # size of the left half
            if k > half:                     # we’re in the right half
                k -= half                    # translate to left‑half index
                if operations[idx] == 1:     # right half is shifted
                    shift = (shift + 1) % 26 # accumulate one +1 shift

        # ── 3. apply the accumulated shift to the original 'a' ───────────
        return chr((ord('a') - ord('a') + shift) % 26 + ord('a'))
