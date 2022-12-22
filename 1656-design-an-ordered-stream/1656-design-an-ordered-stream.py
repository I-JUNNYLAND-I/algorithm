class OrderedStream:

    def __init__(self, n: int):
        self.data = [None]*n
        self.ptr = 0 

    def insert(self, id: int, value: str) -> List[str]:
        id -= 1 
        self.data[id] = value 
        if id > self.ptr: return [] 
        
        while self.ptr < len(self.data) and self.data[self.ptr]: self.ptr += 1
        return self.data[id:self.ptr]

