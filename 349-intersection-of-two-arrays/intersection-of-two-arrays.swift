class Solution {
    func intersection(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var result: [Int] = [Int]()
    
        let num1Set = Set(nums1)
        let num2Set = Set(nums2)
    
        for i in num1Set {
            for j in num2Set {
                if i == j {
                    result.append(i)
                }
            }
        }

        return Array(Set(result))
    }
}