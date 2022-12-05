class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        def match(words):
            d1,d2 = {},{}
            for w,p in zip(words,pattern):
                if w not in d1: 
                    d1[w] = p
                if p not in d2: 
                    d2[p] = w
                if (d1[w], d2[p]) != (p, w):
                    return False
            return True
        
        return filter(match, words)