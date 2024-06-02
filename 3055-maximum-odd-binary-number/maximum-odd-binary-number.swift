class Solution {
    func maximumOddBinaryNumber(_ s: String) -> String {
        
        var count = 0

        for i in s {
            if String(i) == "1" {
                count += 1
            }
        }

        var result = ""
        if count > 0 {
            count -= 1
            result += "1"
        }

        var front = ""
        for _ in 0 ..< count {
            count -= 1
            front += "1"
        }

        for _ in 0 ..< s.count - front.count - 1 {
            front += "0"
        }
        
        return front+result
    }
}