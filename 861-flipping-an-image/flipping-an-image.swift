class Solution {
    func flipAndInvertImage(_ image: [[Int]]) -> [[Int]] {
        var tempArr = [[Int]]()
        for i in image {
            var tempInt = [Int]()
            for j in i {
                tempInt.insert(j, at: 0)
            }
            tempArr.append(tempInt.map { $0 == 1 ? 0 : 1 })
        }
        return tempArr
    }
}