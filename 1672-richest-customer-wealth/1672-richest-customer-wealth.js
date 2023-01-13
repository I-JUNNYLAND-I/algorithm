/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let max=-1
    let temp=0
    accounts.forEach((v)=>{
        
        temp=v.reduce((a,b)=>a+b)
        if(temp>max) max=temp
    })
    
    return max
};