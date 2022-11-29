from collections import defaultdict 
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sdict = defaultdict(int)
        tdict = defaultdict(int)
        
        for i in s:
            sdict[i] += 1
        for i in t:
            tdict[i] += 1
            
        for i in tdict:
            if tdict[i] != sdict[i]:
                return i