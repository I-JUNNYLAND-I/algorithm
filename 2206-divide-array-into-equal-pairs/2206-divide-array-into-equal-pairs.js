/**
 * @param {number[]} nums
 * @return {boolean}
 */
var divideArray = function(nums) {
    let res=[]
    let dividedNum=nums.length/2
    nums.sort((a,b)=>a-b)
    while(nums.length){
        let [temp1,temp2]=[nums.pop(),nums.pop()]
        if(temp1===temp2) res.push([temp1,temp2])
    }

    return dividedNum===res.length?true:false
};