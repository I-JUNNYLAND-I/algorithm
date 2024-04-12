class Solution {
    func minSteps(_ s: String, _ t: String) -> Int {
var hash = [Character: Int]()
    
    for i in t {
        if let map = hash[i] {
            hash[i] = map + 1
        } else {
            hash[i] = 1
        }
    }
    
    var changes = 0
    for i in s {
        if let map = hash[i] {
            let newSum = map - 1
            hash[i] = newSum > 0 ? newSum : nil
        } else {
            changes += 1
        }
    }
    
    return changes

    }
}