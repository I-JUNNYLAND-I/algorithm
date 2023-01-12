/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    return s.split(" ").map((v)=> v.split("").reverse().join("")).join(" ")
};