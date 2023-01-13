/**
 * @param {string[]} words
 * @param {string} s
 * @return {number}
 */
var countPrefixes = function(words, s) {
    let count=0
    let res=Array(words.length).fill(true)
    for(let i=0;i<words.length;i++){
        for(let j=0;j<words[i].length;j++){
            if(words[i][j]!==s[j]) res[i]=false
        }
    }
    return res.filter((v)=>v===true).length
};