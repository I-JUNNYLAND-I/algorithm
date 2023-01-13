/**
 * @param {string[]} patterns
 * @param {string} word
 * @return {number}
 */
var numOfStrings = function(patterns, word) {
    let count=0
    patterns.forEach((v)=>{
        if(word.includes(v)) count++
    })
    return count
};