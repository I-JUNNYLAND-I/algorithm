class UndergroundSystem() {

    val list = mutableListOf<Info>()

    val time = mutableMapOf<String,MutableList<Int>>()

    fun checkIn(id: Int, stationName: String, t: Int) {
        list.add(Info(id,stationName,t))
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val find: Info = list.find { it.id == id }?: throw IllegalAccessError()
        takeIf { time.containsKey("${find.name},$stationName")}
            ?.let { time["${find.name},$stationName"]?.add(t-find.time) }
            ?:let { time["${find.name},$stationName"] = mutableListOf(t-find.time) }
        list.remove(find)
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        val ans = mutableListOf<Int>()
        time["$startStation,$endStation"]?.let { ans.addAll(it) }
        if(ans.size == 0) return 0.0
        return ans.sum().toDouble() / ans.size.toDouble()
    }
}

data class Info(
    val id: Int,
    val name: String,
    val time: Int
)