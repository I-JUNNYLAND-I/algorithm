class Solution {
    fun subdomainVisits(cpdomains: Array<String>): List<String> {

        val map = HashMap<String, Int>()
        for (dom in cpdomains) {
            val s = dom.split("[. ]".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val `val` = s[0].toInt()
            var domain = ""
            for (i in s.size - 1 downTo 1) {
                if (domain != "") domain = ".$domain"
                domain = s[i] + domain
                map[domain] = map.getOrDefault(domain, 0) + `val`
            }
        }
        val list: MutableList<String> = ArrayList()
        val hmIterator: Iterator<*> = map.entries.iterator()
        while (hmIterator.hasNext()) {
            val (key, value) = hmIterator.next() as Map.Entry<*, *>
            val dom = key as String
            val `val` = value as Int
            list.add("$`val` $dom")
        }
        return list
    }
}