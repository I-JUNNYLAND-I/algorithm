class Solution {
    fun uniquePathsIII(grid: Array<IntArray>): Int {
        
        data class PointAndPath (
            val x: Int,
            val y: Int,
            val seen: HashSet<Pair<Int, Int>> 
        )

        val n = grid.size
        val m = grid[0].size
        var toWalk = 0

        val queue = LinkedList<PointAndPath>()

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j]==1) {
                    val set = HashSet<Pair<Int, Int>>()
                    set.add(Pair(i,j)) 
                    queue.addLast(PointAndPath(i,j,set))
                    toWalk++
                }
                else if (grid[i][j]==0) toWalk++
            }
        }

        var result = 0 
        val dir = arrayOf(0,1,0,-1,0) 
 
        while (!queue.isEmpty()) {

            val (x,y,seen) = queue.removeFirst()

            for(i in 0 until dir.size-1) {

                val newX = x+dir[i]
                val newY = y+dir[i+1]

                if (newX>=0 && newX<n 
                    && newY>=0 && newY<m
                    && !seen.contains(Pair(newX,newY))
                    && grid[newX][newY]!=-1)
                {
                    if (grid[newX][newY]==2) {
                        if (seen.size == toWalk) result++
                    }
                    else {
                        val newSeen = seen.toHashSet()
                        newSeen.add(Pair(newX,newY)) 
                        queue.addLast(PointAndPath(newX,newY,newSeen))
                    }
                }
            }
        }

        return result
    }
}