/**
 * @param {string} s
 * @return {string}
 */
var toLowerCase = function(s) {
    return s.split("").map((v)=>v.toLowerCase()).join("")  
};