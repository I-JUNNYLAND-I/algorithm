/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let count=0
    jewels.split("").forEach((v)=>
                            {
        for(let i=0;i<stones.length;i++){
            if(v===stones[i])count++
        }
    })
    return count
};