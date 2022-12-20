class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        cnt = collections.Counter(words[0])
        for s in words:
            cnt2 = collections.Counter(s)
            for k in cnt.keys():
                cnt[k] = min(cnt[k], cnt2[k])
        return cnt.elements()
        