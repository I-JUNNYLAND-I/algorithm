/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSubsequence = function(nums, k) {
    return nums
                .map((elem, index) => [elem, index])
                .sort((a, b) => b[0] - a[0])
                .slice(0, k)
                .sort((a, b) => a[1] - b[1])
                .map(elem => elem[0])
};