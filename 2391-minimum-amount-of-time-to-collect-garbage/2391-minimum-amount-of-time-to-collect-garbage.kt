class Solution {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        val len = garbage.size-1
        var lastGPoint = 0
        var lastPPoint = 0
        var lastMPoint = 0
        var GCount = 0
        var PCount = 0
        var MCount = 0
        for(i in 0..len){
            if(garbage[i].contains("G")){
                lastGPoint = i
            }
            if(garbage[i].contains("P")){
                lastPPoint = i
            }
            if(garbage[i].contains("M")){
                lastMPoint = i
            }
            for (j in garbage[i]){
                if(j=='G'){
                    GCount+=1
                }else if (j=='P'){
                    PCount+=1
                }else{
                    MCount+=1
                }
            }
        }

        return travel.slice(0..lastGPoint-1).sum()+ travel.slice(0..lastPPoint-1).sum()+travel.slice(0..lastMPoint-1).sum()+PCount + MCount + GCount
    }
}