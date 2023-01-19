/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    if(mat.length===1) return mat[0][0]
    let res=0
    let N=mat.length
    for(let i=0;i<N;i++){
        for(let j=0; j<N;j++){
            if(i===j) res+=mat[i][j]
            else if(i+j===N-1) res+=mat[i][j]
        }
    }
    return res
    
};