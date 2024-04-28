class Solution {
    func checkIfPangram(_ sentence: String) -> Bool {
        var tempArr = [Int]()
        for i in 0 ..< 26 {
            tempArr.append(i + 97)
        }
        var tempSet = Set([Int]())
        for i in sentence {
            let tempAscii = Int(i.asciiValue!)
            tempSet.insert(tempAscii)
        }

        return Set(tempArr) == tempSet
    }
}