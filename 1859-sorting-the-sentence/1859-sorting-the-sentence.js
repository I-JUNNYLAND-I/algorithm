/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    
    
    return s.split(" ").sort((a,b)=>a[a.length-1]-b[b.length-1]).map((v)=>{ 
        return v.slice(0,v.length-1)
    }).join(" ")
};