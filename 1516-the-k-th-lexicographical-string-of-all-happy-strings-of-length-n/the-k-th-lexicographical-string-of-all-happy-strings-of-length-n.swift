class Solution {
    func getHappyString(_ n: Int, _ k: Int) -> String {
    
    let character = ["a", "b", "c"]

    func gen(_ pref: String = "") -> [String] {
        pref.count == n ? [pref] : character
            .filter { pref.isEmpty || $0 != String(pref.last!) }
            .map { pref + $0 }
            .flatMap { gen($0) }
    }

    let strs = gen()

    return k > strs.count ? "" : strs[k - 1]
        
    }
}