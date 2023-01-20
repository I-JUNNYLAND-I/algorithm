/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSubsequence = function(nums, k) {
    
    let newArray=nums.map((v,i)=>[v,i]).sort((a,b)=>a[0]-b[0]).slice(nums.length-k)    
    return newArray.sort((a,b)=> a[1]- b[1]).map((v)=>v[0])
    };