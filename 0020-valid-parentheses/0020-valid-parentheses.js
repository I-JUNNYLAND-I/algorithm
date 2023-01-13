/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    s=s.split("").reverse()
    let stack=[]
    let index=0
    while(s.length){
        let temp=s.pop()

        if(!stack.length) stack.push(temp)
        else if(((stack[stack.length-1]==="(" && temp===")")|| (stack[stack.length-1]==="{"&& temp==="}") || (stack[stack.length-1]==="[" && temp==="]")))
            stack.pop()
        else stack.push(temp)
    }
    console.log(stack)
    return stack.length===0?true: false
};
