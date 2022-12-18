/**
 * @param {number[]} nums
 * @return {number}
 */
var countDistinctIntegers = function(nums) {
    const getReversedDigit = (digit) => {
        let nums = [];
        let temp = digit;
        while (temp >= 1) {
            nums.push(temp % 10)
            temp = Math.floor(temp / 10);
        }
        nums.reverse();
        let result = 0;
        for (let i = 0; i < nums.length; i++) {
            result += nums[i] * Math.pow(10, i);
        }
        return result;
    }
    const _nums = Array.from(new Set(nums))
    const reversedNums = Array.from(_nums.map(num => getReversedDigit(num)));
    return new Set([..._nums, ...reversedNums]).size;
};