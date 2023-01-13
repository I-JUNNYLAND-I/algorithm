/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let res=[]
    accounts.forEach((v)=>{
        res.push(v.reduce((a,b)=>a+b))
    })
    
    return Math.max(...res)
};