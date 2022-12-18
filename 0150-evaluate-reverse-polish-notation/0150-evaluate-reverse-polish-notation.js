/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    let stack = [];
    tokens.forEach((elem) => {
        if (elem === "+") {
            stack.push(Number(stack.pop()) + Number(stack.pop()))
        } else if (elem === "*") {
            stack.push(Number(stack.pop()) * Number(stack.pop()))
        } else if (elem === "-") {
            const front = Number(stack.pop())
            const rear = Number(stack.pop())
            stack.push(rear - front) 
        } else if (elem === "/") {
            const front = Number(stack.pop())
            const rear = Number(stack.pop())
            const result = rear / front;
            if (-1 < result && result < 1) {
                stack.push(0)    
            } else if (result <= -1) {
                stack.push(Math.ceil(result))
            } else if (result >= 1) {
                stack.push(Math.floor(result))
            }
        } else {
            stack.push(elem);
        }
    })
    return stack[0];
};