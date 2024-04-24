class Solution {
    func countKDifference(_ nums: [Int], _ k: Int) -> Int {
        var containIndex = [[Int]]()

        var count = 0
        nums.forEach {
            count += 1
            for j in nums.enumerated() {
                if count - 1 != j.offset {
                        if j.element == abs($0 + k) || j.element == $0 - k {
                        var temp = [count - 1, j.offset].sorted()
                        containIndex.append(temp)
                    }
                }
            }
        }

        print(containIndex)
        
        return Set(containIndex).count
    }
}