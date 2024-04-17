class Solution {
    func differenceOfSum(_ nums: [Int]) -> Int {
        let elementSum = nums.reduce(0) { $0 + $1 }
        let digitSum = nums.map { String($0) }
                            .flatMap { $0.map { Int(String($0))! } }
                            .reduce(0) { $0 + $1 }
        return abs(elementSum - digitSum)
    }
}