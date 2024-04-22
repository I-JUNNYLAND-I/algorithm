class Solution {
    func numberOfLines(_ widths: [Int], _ s: String) -> [Int] {
        
        var asciiCode = [Int]()
        for i in s {
            if let asciiValue = i.asciiValue {
                asciiCode.append(Int(asciiValue) - 97)
            }
        }
    
        var limit = 0
        var count = 1
        for i in asciiCode {
            limit += widths[i]
            if limit > 100 {
                count += 1
                limit = widths[i]
            }
        }
    
        return [count, limit]

    }
}