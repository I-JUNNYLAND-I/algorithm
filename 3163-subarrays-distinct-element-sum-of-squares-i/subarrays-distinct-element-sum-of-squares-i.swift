class Solution {
    func sumCounts(_ nums: [Int]) -> Int {
        var result = 0
        var setInt = Set<Int>()
    
        for i in 0 ..< nums.count {
            setInt.insert(nums[i])
            
            for j in stride(from: i, to: nums.count, by: 1) {
                setInt.insert(nums[j])
                result += Int(pow(Double(setInt.count), 2))
            }
            setInt.removeAll()
        }

        return result

    }
}