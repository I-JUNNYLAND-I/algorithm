class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        
            
       for(i in arr.indices) {

            for(j in i+1 until arr.size) {

                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true
                }
            }
        }
        
        return false
    }
}