class Solution:
    def countNicePairs(self, nums: List[int]) -> int:
        d = {}
        for n in nums:
            diff = n-int(str(n)[::-1])
            d[diff] = d.get(diff, 0)+1
        return sum([d[x]*(d[x]-1)//2 for x in d])%(10**9+7)