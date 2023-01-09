class BrowserHistory(_homepage: String) {
    var current: DoubleLinkedList = new DoubleLinkedList(_homepage)
    def visit(url: String) {
        val node = new DoubleLinkedList(url)
        current.next = node
        node.prev = current
        current = node
    }

    def back(steps: Int): String = {
        var s = steps
        while(current.prev != null && s > 0) {
            current = current.prev
            s -= 1
        }
        current.getValue()
    }

    def forward(steps: Int): String = {
        var s = steps
        while(current.next != null && s > 0) {
            current = current.next
            s -= 1
        }
        current.getValue()
    }

}

class DoubleLinkedList(value: String) {
    var prev: DoubleLinkedList = null
    var next: DoubleLinkedList = null
    def getValue() = {
        value
    }
}