/**
 * @param {number} num
 * @return {number}
 */
var maximum69Number  = function(num) {
    num=num.toString().split("").map(Number)
    for(let i=0;i<4;i++){
        if(num[i]===6){
            console.log(num[i])
            num[i]=9
            break;
        }
    }
    return num.join("")
};