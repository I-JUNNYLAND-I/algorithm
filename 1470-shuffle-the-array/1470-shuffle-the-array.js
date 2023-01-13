/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let res=[]
    let yPoint=n
    let xPoint=0
    for(let i=0;i<nums.length;i++){
       if(i%2===0) {res.push(nums[xPoint]); xPoint+=1}
        if(i%2!==0) {res.push(nums[yPoint]); yPoint+=1}
    }
    return res
};