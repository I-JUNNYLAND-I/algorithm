/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let dp=[]
    dp[1]=1
    dp[2]=2
    
    for(let i=3;i<=46;i++){
        dp[i]=dp[i-1]+dp[i-2]
    }
    return dp[n]
    
};