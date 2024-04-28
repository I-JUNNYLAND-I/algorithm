class Solution {
    func arithmeticTriplets(_ nums: [Int], _ diff: Int) -> Int {
        var answer = 0

        nums.forEach {
            if nums.contains($0 + diff), nums.contains($0 + diff + diff) {
                answer += 1
            }
        }

        return answer
    }
}