class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        return len(set([int(str(i)[::-1]) for i in nums] + nums))