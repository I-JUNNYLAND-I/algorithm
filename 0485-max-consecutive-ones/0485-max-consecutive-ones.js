/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let maxAppear=-1
    let appear=0
    let isContinue=false
    for(let i=0;i<nums.length;i++){
        if(nums[i]===1){
            isContinue=true
            ++appear
        }
        else{
            if(maxAppear<appear) maxAppear=appear
            isContinue=false
            appear=0
        }
    }
    if(maxAppear<appear) maxAppear=appear
     return maxAppear
};