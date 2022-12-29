/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {
    let s = num + "";
    let arr = s.split("").sort((a, b) => a - b);
    let num1 = Number(arr[0] + arr[3]);
    let num2 = Number(arr[1] + arr[2]);
    return num1 + num2;
};