/**
 * @param {number[]} nums
 * @param {number[]} queries
 * @return {number[]}
 */
var answerQueries = function(nums, queries) {
    const qLen = queries.length
    const nLen = nums.length
    nums = nums.sort((a, b) => a - b)
    let answer = []
    for(let i = 0; i < qLen; i++) {
        let target = queries[i]
        let len = 0
        let max = 0
        let temp = []
        for(let j = 0; j < nLen; j++) {
            if(target >= nums[j]) {
                target -= nums[j]
                len++
            }   
            max = Math.max(max, len)
        }
        answer.push(max)    
    }
    return answer === [] ? [0] : answer
};