class Solution {
    fun simplifyPath(path: String): String {

        var answer = "/"

        val split = path.split("/")
            .filter { it.isNotEmpty() }

        split.forEach {
            when (it) {
                ".." -> answer = answer.substring(0, answer.lastIndexOf("/"))
                "." -> {}
                else -> answer += "/$it"
            }
            if (answer.isEmpty()) answer += "/"
        }
        answer = if (answer.isEmpty()) "/"
        else if (answer.contains("//")) answer.replace("//", "/")
        else answer
        println("answer = $answer")



        return answer
    }
}