class Solution {
    fun removeDuplicates(s: String): String {

        var check: Int = 0
        val toMutableList = s.toCharArray().toMutableList()
        while (check != toMutableList.lastIndex) {
            if (toMutableList.size == 0) {
                return ""
            }
            if (toMutableList[check] == toMutableList[check + 1]) {
                toMutableList.removeAt(check)
                toMutableList.removeAt(check)
                check = 0
                continue
            }
            check++
        }
        var answer: String = ""
        toMutableList.forEach { answer = answer.plus(it) }

        return answer
    }
}