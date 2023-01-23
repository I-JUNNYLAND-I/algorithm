/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let balace=0;
    let splitCount=0;
    let i=0
    let sLength=s.length
    while(i<sLength){
        if(s[i]==='R'){
            balace++
        }
        else{
            balace--
        }
        if(balace===0){
            splitCount++
        }
        i++
    }
    return splitCount
};