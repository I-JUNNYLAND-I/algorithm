class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count=Counter(nums)
        c=0
        for i in count:
            if count[i]<2:
                c+=0
            if count[i]==2:
                c+=1
            if count[i]>2:
                c+=sum(range(0,count[i]))
        return c