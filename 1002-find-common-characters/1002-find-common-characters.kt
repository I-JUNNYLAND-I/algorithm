class Solution {
fun commonChars(A: Array<String>): List<String> {
    val characters = Array(26) { IntArray(A.size) }
    for (i in A.indices)
        for (c in A[i])
            characters[c - 'a'][i]++
    return characters
        .withIndex()
        .map { (c, words) -> List(words.min()!!) { ('a' + c).toString() } }
        .flatten()
}
}