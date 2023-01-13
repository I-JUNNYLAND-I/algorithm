/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */
var prefixCount = function(words, pref) {
    let count=0
    
    words.forEach((v)=>{
        if(v.slice(0,pref.length)===pref)count++
    })
    return count
};