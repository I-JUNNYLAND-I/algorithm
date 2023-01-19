/**
 * @param {number[]} nums
 * @return {number}
 */
var minPairSum = function(nums) {
    let N=nums.length/2
    let max=-1
    nums.sort((a,b)=>a-b)
    for(let i=0;i<N;i++){
        if(nums[i]+nums[nums.length-1-i]>max) max=nums[i]+nums[nums.length-1-i]
    }
   return max
};