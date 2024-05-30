class Solution {
    func minLength(_ s: String) -> Int {
        var stack = s.map { Int($0.asciiValue!) }
        var result = [Int]()
        var count = 0

        loopStack(stack: stack)

        func loopStack(stack: [Int]) {
            var stacks = stack
            result = stacks
            guard stacks.count != 0 else { return }
            for i in 0 ..< stacks.count - 1 {
                if stacks[i] == 65 && stacks[i + 1] == 66 || stacks[i] == 67 && stacks[i + 1] == 68 {
                    count += 1
                    stacks.remove(at: i + 1)
                    stacks.remove(at: i)
                    loopStack(stack: stacks)
                    break
                }
            }
        }

        if count == 0 {
            return s.count
        } else {
            return result.count
        }
    }
}