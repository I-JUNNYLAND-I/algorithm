class Solution {
 fun squareIsWhite(coordinates: String): Boolean {
    val colNumber = (coordinates[0] - 'a') + 1
    val rowNumber = coordinates[1].toString().toInt()
    
    return colNumber % 2 != rowNumber % 2
  }
}