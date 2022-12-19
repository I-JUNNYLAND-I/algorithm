class Solution:
    def findGCD(self, nums: List[int]) -> int:
        ma = max(nums)
        mi = min(nums)
        
        return gcd(ma,mi)
    
    def gcd(self, left, right):
        i = left
        while (True):
            if i%ma ==0 and i% mi == 0:
                return i
            