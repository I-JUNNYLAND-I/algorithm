/**
 * Definition for a Node.
 * public class Node {
 *     public var val: Int
 *     public var children: [Node]
 *     public init(_ val: Int) {
 *         self.val = val
 *         self.children = []
 *     }
 * }
 */

class Solution {
    func preorder(_ root: Node?) -> [Int] {
        guard let root else { return [] }

        var result = [Int]()
        result.append(root.val)

        root.children.forEach {
            result.append(contentsOf: preorder($0))
        }
        
        return result
    }
}