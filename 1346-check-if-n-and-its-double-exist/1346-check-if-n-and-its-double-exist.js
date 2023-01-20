/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    if(arr.length-arr.filter((v)=>v!==0).length>=2) return true

    for(let i=0; i<arr.length;i++){
         if(arr.indexOf(arr[i]*2)!==-1 && arr[i]!==0){
            return true
        }
    }
    return false
};