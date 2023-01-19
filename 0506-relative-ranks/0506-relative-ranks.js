/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function(score) {
    let res=Array(score.length).fill(0)
    let tempStack=score.slice().sort((a,b)=>a-b)
    
    for(let i=0;i<score.length;i++){
        let maxNum=tempStack.pop()
        let index=score.indexOf(maxNum)
        if(i<3){
            i===0?res[index]="Gold Medal":(i===1?res[index]="Silver Medal":res[index]="Bronze Medal")
        }
        else{       
            res[index]=String(i+1)            
        }
    }
    return res
};