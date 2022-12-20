class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        s = {n: i for i, n in enumerate(sorted(score, reverse=True))}
        medals = ['Gold', 'Silver', 'Bronze']
        return [str(s[n]+1) if s[n] >= len(medals) else (medals[s[n]] + ' Medal') for n in score]