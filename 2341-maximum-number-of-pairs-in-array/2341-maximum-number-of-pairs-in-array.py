class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        cnt = Counter(nums)
        ans = [0, 0] 
        for v in cnt.values():
            ans[0] += v // 2
            ans[1] += v % 2
        return ans