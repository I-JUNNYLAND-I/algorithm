/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    let count=0
    if(arr.length-arr.filter((v)=>v!==0).length>=2) return true
    let flag=false
    
    arr.forEach((v)=>{
        if(arr.indexOf(v*2)!==-1 && v!==0){
            flag=true
        }
    })
    return flag
};