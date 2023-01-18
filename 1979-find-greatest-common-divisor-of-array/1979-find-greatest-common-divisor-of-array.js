/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    console.log(nums.sort((a,b)=>a-b))
    console.log(nums[0],nums[nums.length-1])
    let max=nums[nums.length-1]
    let min=nums[0]
    
    while(1){
        let r=max%min;
        if(r==0) return min
        
        max=min;
        min=r;
    }
};