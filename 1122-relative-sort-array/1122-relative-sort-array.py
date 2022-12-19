class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        c = collections.Counter(arr1)
        res = []       
        for i in arr2:
            res += [i]*c.pop(i)  
        return res + sorted(c.elements())