class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        return chr(sum(list(t.encode("ascii"))) - sum(list(s.encode("ascii"))))


