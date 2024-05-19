class Solution {
    func getLongestSubsequence(_ words: [String], _ groups: [Int]) -> [String] {
        var previous = groups[0]
        var result = [String]()
        result.append(words[0])
        
        for index in 1..<words.count {
            if(groups[index] != previous) {
                result.append(words[index])
                previous = groups[index]
            }
        }
        
        return result
    }
}