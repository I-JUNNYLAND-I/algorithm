/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSubsequence = function(nums, k) {
    
    let newArray=nums.map((v,i)=>[v,i])
    newArray=newArray.sort((a,b)=>a[0]-b[0]).slice(newArray.length-k)
    
    newArray.sort((a,b)=> a[1]- b[1])
    return newArray.map((v)=>v[0])
    };