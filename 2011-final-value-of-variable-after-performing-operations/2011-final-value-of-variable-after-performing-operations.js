/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let X=0
    operations.forEach((v)=>{
        if(v[0]==="-" || v[1]==="-") X-=1
        else X+=1
    })
    return X
};