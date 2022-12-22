class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if(root == null) return listOf()
        
        val listData:ArrayList<String> = arrayListOf()
        if(root.left == null && root.right == null){
            listData.add("${root.`val`}")
        }else{
            findPath(root.left,"${root.`val`}",listData)
            findPath(root.right,"${root.`val`}",listData)
        }
        return listData.toList()
    }
    
    fun findPath(root:TreeNode?,path:String,pathData:ArrayList<String>){
        if(root == null) return
            
        val updatedPath = "$path->${root.`val`}"
            
        if(root.left == null && root.right != null)
            findPath(root.right,updatedPath,pathData)
            
        if(root.left != null && root.right == null)
            findPath(root.left,updatedPath,pathData)
         
        if(root.left != null && root.right != null){
            findPath(root.left,updatedPath,pathData)
            findPath(root.right,updatedPath,pathData)
        }
         
        if(root.left == null && root.right == null){
            pathData.add(updatedPath)
        }
    }
}