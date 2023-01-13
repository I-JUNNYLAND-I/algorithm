/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    return s.split(" ").map((v,i)=>{
        if(i<k) return v
    }).filter((v)=>v!==undefined).join(" ")
};