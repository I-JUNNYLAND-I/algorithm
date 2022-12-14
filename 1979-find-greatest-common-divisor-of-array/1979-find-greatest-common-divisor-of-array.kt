class Solution {
fun findGCD(nums: IntArray): Int {
    return gcd(nums.min()!!, nums.max()!!)
}
fun gcd(p: Int, q: Int): Int {
    return if (q == 0) p 
    else gcd(q, p % q)
}
}