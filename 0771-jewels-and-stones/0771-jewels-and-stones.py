from collections import defaultdict

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        stoneCount = defaultdict(int)
        for i in stones:
            stoneCount[i] += 1
        ans = 0
        for i in jewels:
            ans += stoneCount[i]
        return ans
    