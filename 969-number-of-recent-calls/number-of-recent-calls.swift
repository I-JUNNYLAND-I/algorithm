
class RecentCounter {
    var slide: [Int]

    init() {
        slide = [Int]()    
    }
    
    func ping(_ t: Int) -> Int {
        slide.append(t)
        while slide.first! < t - 3000 {
            slide.removeFirst()
        }
        return slide.count
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * let obj = RecentCounter()
 * let ret_1: Int = obj.ping(t)
 */