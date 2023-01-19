/**
 * @param {string} s
 * @return {character}
 */
var repeatedCharacter = function(s) {
    let word={}
    
    for(let i=0;i<s.length;i++){
        word[s[i]]?word[s[i]]+=1:word[s[i]]=1
        if(word[s[i]]>=2)return s[i]
    }
};