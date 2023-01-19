/**
 * @param {string[]} words
 * @return {string[]}
 */
var commonChars = function(words) {
    let res=[]
    let minCount=[]
    let countWord=Array.from({length:words.length}, ()=>Array(26).fill(0))
    
    for(let i=0;i<words.length;i++){
        for(let j=0;j<words[i].length;j++){
            countWord[i][words[i][j].charCodeAt()-97]+=1
        }
    }
    for(let i=0;i<=26;i++){
        for(let k=0;k<words.length;k++){
            minCount.push(countWord[k][i])
        }
        let commonMin=Math.min(...minCount)
        if(commonMin>=1){
            for(let j=0;j<commonMin;j++){
            res.push(String.fromCharCode(i+97))
            }
        }
        minCount=[]
    }
    return res
    
};