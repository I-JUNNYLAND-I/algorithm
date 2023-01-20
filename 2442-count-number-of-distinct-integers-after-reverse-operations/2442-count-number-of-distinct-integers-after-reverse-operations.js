/**
 * @param {number[]} nums
 * @return {number}
 */

function reverseNum(num){
    let tempStack=[]
    if(num<10){
        return num
    }
    while(num>=10){
        tempStack.push(num%10)
        num=Math.trunc(num/10)
    }
    tempStack.push(num)
    return +tempStack.join("")
}
var countDistinctIntegers = function(nums) {
    let N=nums.length
    let res=new Set(nums)
    let tempNum=-1
    for(let i=0;i<N;i++){
        tempNum =reverseNum(nums[i])
        res.add(tempNum)
    }

    return res.size
};

