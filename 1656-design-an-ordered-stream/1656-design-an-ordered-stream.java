class OrderedStream {

    int n;
    int val;
    List<String> list = new ArrayList<>();

    public OrderedStream(int n) {
        this.n = n;
        this.val = 0;

        for(int i=0; i<n; i++) {
            list.add("");
        }
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        list.set(idKey-1,value);

        if(list.get(val).equals("")) {
            return result;
        }

        while(val<n && !list.get(val).equals(""))
        {
            result.add(list.get(val));
            val++;
        }

        return result;
    }
    
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */