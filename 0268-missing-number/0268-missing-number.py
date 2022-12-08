class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        a=sum(nums)
        total = sum([i for i in range(len(nums)+1)])
        return total - a