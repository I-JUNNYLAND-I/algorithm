/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let isAppear=Array(nums.length).fill(0)
    nums.forEach((v)=>{
        isAppear[v]=1
    })
    return isAppear.indexOf(0)!==-1?isAppear.indexOf(0):nums.length
};