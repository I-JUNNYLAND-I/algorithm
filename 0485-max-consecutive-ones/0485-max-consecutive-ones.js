/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let maxAppear=-1
    let appear=0
    for(let i=0;i<nums.length;i++){
        if(nums[i]===1){
            appear+=1
        }
        else{
            if(maxAppear<appear) maxAppear=appear
            appear=0
        }
    }
    if(maxAppear<appear) maxAppear=appear
     return maxAppear
};