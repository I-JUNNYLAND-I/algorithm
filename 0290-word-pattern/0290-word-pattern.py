class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
 
        words = str.split(" ")
        if not len(words) == len(pattern):
            return False
        
        mapping = dict()
        
        for i in range(len(words)):
            if pattern[i] not in mapping:
                if words[i] not in mapping.values(): 
                    mapping[pattern[i]] = words[i]
                else:
                    return False
            else:
                if not mapping[pattern[i]] == words[i]:
                    return False
        return True
                