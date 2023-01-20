/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let map = new Map()
    let res=true
    s=s.split(" ")
    if(s.length !==pattern.length) return false
    if(new Set(s).size !== new Set(pattern).size) return false
    for(let i=0;i<pattern.length;i++){
       if(!map.has(pattern[i])){
           map.set(pattern[i],s[i])
       }
       
        if(s[i]!==map.get(pattern[i])) return false
    }    
    
   return res
    
};
