class OrderedStream {
    private String[] stream;
    private int ptr = 0;
    
    public OrderedStream(int n) {
        this.stream = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        stream[idKey - 1] = value;
        while (ptr < stream.length && stream[ptr] != null) {
            list.add(stream[ptr]);
            ptr++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */