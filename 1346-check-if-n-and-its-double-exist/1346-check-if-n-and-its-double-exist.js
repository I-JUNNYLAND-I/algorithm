/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    console.log(arr)
    let count=0
    for(let i=0;i<arr.length;i++){
        if(arr[i]===0)count++
        if(count>=2)return true
    }
    let flag=false
    
    arr.forEach((v)=>{
        if(arr.indexOf(v*2)!==-1 && v!==0){
            flag=true
        }
    })
    return flag
};