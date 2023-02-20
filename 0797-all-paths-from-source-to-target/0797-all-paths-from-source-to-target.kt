class Solution {
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        val ans : MutableList<MutableList<Int>> = arrayListOf()
        val N = graph.size
        
        dfs(0, mutableListOf(0), graph, N - 1, ans)
        
        return ans
    }
    
    private fun dfs(cur: Int, 
                    path: MutableList<Int>, 
                    graph: Array<IntArray>, 
                    destination: Int,
                    paths: MutableList<MutableList<Int>>): Unit{
        
        if(cur == destination){
            paths.add(path.toMutableList())
            return
        }
        
        for(next in graph[cur]){
            path.add(next)
            dfs(next, path, graph, destination, paths)
            // path.remove(path.last())
            path.remove(path.last())
        }
    }
}