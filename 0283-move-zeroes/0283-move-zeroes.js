/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let numArr=[]
    let zeroArr=[]
    nums=nums.reverse()
    while(nums.length){
        let tempNum=nums.pop()
        if(tempNum===0) zeroArr.push(tempNum)
        else numArr.push(tempNum)
    }
    
   nums.push(...numArr)
   nums.push(...zeroArr)
}
