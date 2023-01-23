/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {
    num=String(num).split("").sort()
    return parseInt(num[0]+num[2]) + parseInt(num[1]+num[3])
};