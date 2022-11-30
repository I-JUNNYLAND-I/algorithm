class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        info = [[names[i],heights[i]] for i in range(len(names))]
        info.sort(key= lambda x:(-x[1]))
        return [i[0] for i in info]
        