fun main(){
    val num = readLine()!!.toInt()
    val arr = ArrayList<Pair<Int,Int>>()
    for(i in 0 until num){
        val line = readLine()!!.split(" ").map{it.toInt()}
        arr.add(Pair(line[0],line[1]))
    }
    arr.sortWith(Comparator{d1,d2 -> if(d1.second == d2.second) {
        d1.first - d2.first
    }else{
        d1.second-d2.second
    }
    })
 
    for(i in 0 until num){
        println("${arr[i].first} ${arr[i].second}")
    }
}
