/**
 * @param {number} lowLimit
 * @param {number} highLimit
 * @return {number}
 */
var countBalls = function(lowLimit, highLimit) {
    let baxCount=Array(46).fill(0)
    
    let i=lowLimit
    
    while(i<=highLimit){
        let tempNum=String(i).split("").map(Number).reduce((a,b)=>a+b)
        baxCount[tempNum]+=1
        i++
    }
    return Math.max(...baxCount)
    };