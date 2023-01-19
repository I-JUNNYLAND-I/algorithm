/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    let res=Array(words.length).fill(true)
    for(let i=0;i<words.length;i++){
        for(let j=0;j<words[i].length;j++){
            if(allowed.indexOf(words[i][j])===-1){
              res[i]=false
            break;
            }
        }
    }
    return res.filter((v)=>v!==false).length
    
};