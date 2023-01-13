/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function(operations) {
    let score=[]
    operations.forEach((v)=>{
        if(!Number.isNaN(+v)) score.push(+v)
        else if(v==="C") score.pop()
        else if(v==="D") score.push(score[score.length-1]*2)
        else score.push((score[score.length-1]+score[score.length-2]))
    })
    return score.length?score.reduce((a,b)=>a+b):0
};