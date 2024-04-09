class Solution {
    func mostWordsFound(_ sentences: [String]) -> Int {
        var maxium = 0
        for i in sentences {
            if maxium < i.components(separatedBy: " ").count {
                maxium = i.components(separatedBy: " ").count
            }
        }

        return maxium
    }
}