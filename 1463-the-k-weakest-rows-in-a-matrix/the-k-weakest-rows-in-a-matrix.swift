class Solution {
    func kWeakestRows(_ mat: [[Int]], _ k: Int) -> [Int] {
        
        var result: [Int] = [Int]()
    
        let matMap = mat.compactMap { $0.filter {$0 == 1}.count}
        var findArr = Array(matMap.sorted()[0..<k])

        for i in Array(matMap.sorted()[0..<k]) {
            for j in matMap.enumerated() {
                if j.element == i && !result.contains(j.offset) {
                    result.append(j.offset)
                }
            }
        }

        return Array(result[0..<k])

    }
}