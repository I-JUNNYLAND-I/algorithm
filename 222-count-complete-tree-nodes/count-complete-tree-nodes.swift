/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init() { self.val = 0; self.left = nil; self.right = nil; }
 *     public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
 *     public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *     }
 * }
 */
class Solution {
    func countNodes(_ root: TreeNode?) -> Int {
        guard let root else { return 0 }
        
        var result = 1
        result += self.countNodes(root.left) + self.countNodes(root.right)

        return result
    }
}

/*
해당 문제는 root value가 무조건 있다고 생각하여 1을 추가해줍니다
root가 없을 경우 guard구문으로 0을 반환해줍니다
result에서 val을 optional 체크를 하게 될 경우 유효한 정답이 나오지 않습니다
*/