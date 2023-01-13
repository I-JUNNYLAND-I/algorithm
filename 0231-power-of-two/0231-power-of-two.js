/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
        
let powerOfTowArr=[1,2,4]

for(let i=3;i<32;i++){
    powerOfTowArr.push(powerOfTowArr[i-1]*2)
}
    return powerOfTowArr.includes(n)?true:false
};