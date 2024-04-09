class Solution {
    func finalString(_ s: String) -> String {
        var result = ""
        for i in s {
            if i == "i" {
                result = String(result.reversed())
            } else {
                result.append(i)
            }
        }
        return result
    }
}