/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let max=-1
    accounts.forEach((v)=>{
        
        let temp=v.reduce((a,b)=>a+b)
        if(temp>max) max=temp
    })
    
    return max
};