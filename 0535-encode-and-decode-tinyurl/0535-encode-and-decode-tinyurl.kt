class Codec() {
     fun encode(longUrl: String): String {
        return Base64.getEncoder().encodeToString(longUrl.toByteArray())
    }

    fun decode(shortUrl: String): String {
        return String(Base64.getDecoder().decode(shortUrl))
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */