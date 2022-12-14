class Solution {
fun isValid(s: String): Boolean {
    var stack = Stack<Char>()
    
    s.toCharArray().forEach { 
        if(it == '(' || it == '{' || it == '['){
            stack.push(it)
        }else{
            if(stack.isEmpty()) return false
            val top = stack.pop()
            if(it == ')' && top != '(') return false
            if(it == '}' && top != '{') return false
            if(it == ']' && top != '[') return false
        }
    }
    return stack.isEmpty()
}
}