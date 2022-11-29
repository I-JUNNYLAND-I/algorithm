class RandomizedSet {

    private Map<Integer, Integer> map = new HashMap<>();
    private Random random = new Random();

    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Object[] values = map.values().toArray();
        int length = values.length;
        int index = random.nextInt(length);
        return (Integer)values[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */