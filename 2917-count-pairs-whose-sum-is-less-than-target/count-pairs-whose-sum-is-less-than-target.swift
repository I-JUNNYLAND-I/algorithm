class Solution {
    func countPairs(_ nums: [Int], _ target: Int) -> Int {
        var sum = 0
        for i in nums.enumerated() {
            for j in i.offset + 1..<nums.count {
                if i.element + nums[j] < target {
                    sum += 1
                }
            }
        }
    
        return sum
    }
}