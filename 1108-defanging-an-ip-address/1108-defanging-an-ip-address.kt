class Solution {
    fun defangIPaddr(address: String): String =address.split("").map { if (it == ".") "[.]" else it }.joinToString("")
}