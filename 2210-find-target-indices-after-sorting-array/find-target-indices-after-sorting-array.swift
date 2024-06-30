class Solution {
    func targetIndices(_ nums: [Int], _ target: Int) -> [Int] {
        var result: [Int] = [Int]()
        for i in nums.sorted().enumerated() {
            if i.element == target {
                result.append(i.offset)
            }
        }
        return result
    }
}