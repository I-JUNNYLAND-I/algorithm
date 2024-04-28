class Solution {
    func findIntersectionValues(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var result1 = 0
        var result2 = 0

        nums1.forEach {
            if nums2.contains($0) { result1 += 1 }
        }
    
        nums2.forEach {
            if nums1.contains($0) { result2 += 1 }
        }
    
        return [result1, result2]

    }
}