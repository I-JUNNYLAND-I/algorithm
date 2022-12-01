class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if(i == "[" or i == "(" or i == "{"):
                stack.append(i)
            elif(i == ')' and len(stack) >0):
                if(stack.pop()!="("):
                    return False
            elif(i == ']' and len(stack) >0):
                if(stack.pop()!="["):
                    return False
            elif(i == '}' and len(stack) >0):
                if(stack.pop()!="{"):
                    return False   
            else:
                return False
        return True if len(stack)==0 else False
                
        