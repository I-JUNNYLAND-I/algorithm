class Codec() {
    val map = mutableMapOf<String, String>()
    var inc = 100

    fun encode(longUrl: String): String {
        val key = Integer.toHexString(inc++)
        map[key] = longUrl
        return "http://tinyurl.com/" + key

    }

    fun decode(shortUrl: String): String {
        val key = shortUrl.substring(shortUrl.indexOfLast { it=='/' }+1)
        return map[key]!!
    }
}