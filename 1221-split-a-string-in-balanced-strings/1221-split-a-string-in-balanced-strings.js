/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let Rcount=0;
    let Lcount=0
    let splitCount=0;
    let i=0
    while(i<s.length){
        if(s[i]==='R'){
            Rcount++
        }
        else{
            Lcount++
        }
        if(Rcount===Lcount){
            splitCount++
            Rcount=0
            Lcount=0
        }
        i++
    }
    return splitCount
};