/**
 * @param {number[]} nums
 * @return {number[]}
 */
var numberOfPairs = function(nums) {
    let obj={}
    let pair=0
    let nonpair=0
    for(let i=0;i<nums.length;i++){
        obj[nums[i]]?obj[nums[i]]+=1:obj[nums[i]]=1
    }
    console.log(obj)
    for(count of Object.values(obj)){
        nonpair+=count%2
        pair+=Math.trunc(count/2)
    }
    return [pair,nonpair]
    
};