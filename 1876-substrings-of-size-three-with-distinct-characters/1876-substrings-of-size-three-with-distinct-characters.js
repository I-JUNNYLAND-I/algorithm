/**
 * @param {string} s
 * @return {number}
 */
var countGoodSubstrings = function(s) {
    let res=[]
    for(let i=0;i<s.length-2;i++){
        res.push(s.slice(i,i+3))
    }
    return res.filter((v)=>{
        if(v[0]!==v[1] && v[1]!==v[2]&&v[0] !==v[2]) return v
    }).length
};
//xyz
//yzz
//zza
//zaz