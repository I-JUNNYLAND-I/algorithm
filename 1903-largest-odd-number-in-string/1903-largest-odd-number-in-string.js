/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {
    let pR = num.length - 1;
    while (pR >= 0) {
        if (Number(num[pR]) % 2 === 0) pR--;
        else break;
    }
    return pR >= 0 ? num.substring(0, pR + 1) : "";
};