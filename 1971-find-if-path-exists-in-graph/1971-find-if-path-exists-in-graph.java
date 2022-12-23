class Solution {
    
    boolean found = false;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (n == 1 && source == destination) return true;
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) map.put(i, new ArrayList<Integer>());
        for (int[] edge : edges) {
            int s = edge[0]; // source
            int d = edge[1]; // destination
            map.get(s).add(d);
            map.get(d).add(s);
        }
        moveTo(map, visited, source, destination);
        return found;
    }
    
    private void moveTo(Map<Integer, List<Integer>> map, boolean[] visited, int start, int end) {
        if(visited[start] || found) return;
        visited[start] = true;
        for (int vertex : map.get(start)) {
            if (vertex == end) {
                found = true;
                break;
            }
            if (!visited[vertex]) {
                moveTo(map, visited, vertex, end);
            }
        }
    }
}