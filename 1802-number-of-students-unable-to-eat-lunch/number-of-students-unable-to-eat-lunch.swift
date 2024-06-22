class Solution {
    func countStudents(_ students: [Int], _ sandwiches: [Int]) -> Int {

        var ctrs: [Int] = [0, 0]
        ctrs[1] = students.reduce(0, +)
        ctrs[0] = students.count - ctrs[1]
        for s in sandwiches {
            if ctrs[s] == 0 {
                break
            }
            ctrs[s] -= 1
        }

        return Int(max(ctrs[0], ctrs[1]))
        
    }
}