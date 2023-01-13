/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let word1Point=0
    let word2Point=0
    let length=Math.max(word1.length,word2.length)
    let res=[]
    for(let i=0;i<length*2;i++){
        if(i%2==0) {
            word1[word1Point]?res.push(word1[word1Point]):""
            word1Point++
        }
        if(i%2==1) {
            word2[word2Point]?res.push(word2[word2Point]):""
            word2Point++
        }
    }
    return (res.join(""))
};