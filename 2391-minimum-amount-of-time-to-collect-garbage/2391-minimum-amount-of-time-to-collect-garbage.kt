class Solution {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
    var G = 0
    var P = 0
    var M = 0
    var sum = 0
    
    for (i in 0 until garbage.size) {
        for (j in 0 until garbage[i].length) {
            if (garbage[i][j] == 'G') {
                sum++
                if (i == garbage.size - 1) {
                    for (g in G until travel.size) {
                        sum += travel[g]
                        G = i
                    }
                } else {
                    for (g in G until i) {
                        sum += travel[g]
                        G = i
                    }
                }
            }
            if (garbage[i][j] == 'P') {
                sum++
                if (i == garbage.size - 1) {
                    for (g in P until travel.size) {
                        sum += travel[g]
                        P = i
                    }
                } else {
                    for (g in P until i) {
                        sum += travel[g]
                        P = i
                    }
                }
            }
            if (garbage[i][j] == 'M') {
                sum++
                if (i == garbage.size - 1) {
                    for (g in M until travel.size) {
                        sum += travel[g]
                        M = i
                    }
                } else {
                    for (g in M until i) {
                        sum += travel[g]
                        M = i
                    }
                }
            }
        }

    }
    return sum
    }
}