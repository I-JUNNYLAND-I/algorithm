/**
 * @param {number} lowLimit
 * @param {number} highLimit
 * @return {number}
 */
var countBalls = function(lowLimit, highLimit) {
    let baxCount=Array(46).fill(0)
    
    let i=lowLimit
    
    while(i<=highLimit){
        let tempSum=0
        let tempI=i
        if(tempI<10)tempSum=i
        else{
            while(tempI>9){
            tempSum+=tempI%10
            tempI=Math.trunc(tempI/10);
             }
            tempSum+=tempI
        }
        baxCount[tempSum]+=1
        i++
    }
    return Math.max(...baxCount)
    };