class Solution {
    func shortestCompletingWord(_ licensePlate: String, _ words: [String]) -> String {
        var words = words
        var wordsSortedByLength = words.sorted(by: {$0.count < $1.count})

        var extractedString = licensePlate.filter { character in !character.isWhitespace && !character.isNumber }
                                        .lowercased()

        var remainding = [String]()
    
        for var word in wordsSortedByLength {
            word.removeAll(where: { chac in
                !extractedString.contains(chac)
            })
            remainding.append(word)
        }
    
        let diff = zip(wordsSortedByLength, remainding)
    
        for (_,value) in diff.enumerated() {
            if extractedString.sorted() == value.1.sorted() || extractedString.sorted().count < value.1.sorted().count {
                return value.0
            }
        }
        return " "
    }
}