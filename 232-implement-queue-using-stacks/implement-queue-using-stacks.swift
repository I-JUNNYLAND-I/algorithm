
class MyQueue {

    var source = [Int]()
    var index = 0
    
    func push(_ x: Int) {
        source.append(x)
    }
    
    func pop() -> Int {
        if source.isEmpty || index >= source.count {
            return -1
        } else {
            let pop = source[index]
            index += 1
            return pop
        }
    }
    
    func peek() -> Int {
        if source.isEmpty { 
            return -1 
        } else {
            return source[index]
        }
    }
    
    func empty() -> Bool {
        return source.isEmpty || index >= source.count
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * let obj = MyQueue()
 * obj.push(x)
 * let ret_2: Int = obj.pop()
 * let ret_3: Int = obj.peek()
 * let ret_4: Bool = obj.empty()
 */