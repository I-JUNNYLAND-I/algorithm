class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        return sum([1 for i in words if set(list(i)) <= set(list(allowed))])
