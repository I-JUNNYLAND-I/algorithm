/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    let res=0
    if(num<10) return num
    while(num>=10){
        res=0
        String(num).split("").forEach((v)=>{
            res+=+v
        })
        if(res<10) break
        num=res
    }
    return res
};