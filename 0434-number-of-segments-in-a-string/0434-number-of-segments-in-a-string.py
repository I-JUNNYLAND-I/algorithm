class Solution:
    def countSegments(self, s: str) -> int:
        return len([i for i in s.split(" ") if i!=""])