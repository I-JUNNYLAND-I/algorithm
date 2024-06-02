class Solution {
    func maximizeSum(_ nums: [Int], _ k: Int) -> Int {
        
        let a = nums.sorted().last ?? 0
        var result = 0
        for i in 0 ..< k {
            result += a + i
        }

        return result
        
    }
}