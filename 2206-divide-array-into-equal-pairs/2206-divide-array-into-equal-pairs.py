class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        count = Counter(nums)
        for i in count:
            if count[i] % 2 ==1:
                return False
        return True