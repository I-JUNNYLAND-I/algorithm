/**
 * @param {number[][]} mat
 * @param {number} k
 * @return {number[]}
 */
var kWeakestRows = function(mat, k) {
    let weaker = [];
    for (let i = 0; i < mat.length; i++) {
        const sum = mat[i].reduce((sum, cur) => sum + cur, 0);
        weaker.push([sum, i]);
    }
    return weaker
        .sort((a, b) => a[0] - b[0])
        .map(arr => arr[1]).slice(0, k);
};