class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character> keys = map.keySet();
        List<Char> list = new ArrayList<>();
        for (Character key : keys) {
            list.add(new Char(key, map.get(key)));
        }
        list.sort(Char::compareTo);
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < list.size(); j++) {
            sb.append(list.get(j));
        }
        return sb.toString();
    }
    
    class Char implements Comparable<Char> {
        char c;
        int frequency;

        public Char(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Char c) {
            return c.frequency - frequency;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < frequency; i++) {
                sb.append(c);
            }
            return sb.toString();
        }
    }
}