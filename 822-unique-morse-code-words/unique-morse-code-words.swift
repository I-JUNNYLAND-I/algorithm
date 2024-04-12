class Solution {
    func uniqueMorseRepresentations(_ words: [String]) -> Int {
        let dotLetters = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

        var arr = [String]()
        for i in words {
            let ascii = i.map { $0.asciiValue! - 97}
            var result = ""
            for j in ascii {
                result += dotLetters[Int(j)]
            }
            arr.append(result)
        }

        return Set(arr).count
    }
}