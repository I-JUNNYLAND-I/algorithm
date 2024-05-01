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
    func averageOfLevels(_ root: TreeNode?) -> [Double] {
        guard let root else { return [] }

        var result: [Double] = []
        var queue = [root]

        while !queue.isEmpty {
            var next: [TreeNode] = []
            var sum = 0

            for i in queue {
                i.left.map { next.append($0) }
                i.right.map { next.append($0) }
                sum += i.val
            }
            
            result.append(Double(sum)/Double(queue.count))
            queue = next
        }

        return result
    }
}