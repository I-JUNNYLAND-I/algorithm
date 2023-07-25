package com.quid.codes.history

class PeakIndexInMountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size-1
        while (left < right){
            if(arr[left] <= arr[right]){
                left +=1
            }else{
                right-=1
            }
        }
        return left
    }
}