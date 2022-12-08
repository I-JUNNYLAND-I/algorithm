class Solution:
    def calPoints(self, operations: List[str]) -> int:
        ans=[]
        a=0
        for i in operations:
            if i=="C":
                a=ans.pop()
            elif i=="D":
                ans.append(2*ans[-1])
            elif i=="+":
                ans.append(ans[-1]+ans[-2])
            else:
                ans.append(int(i))
        return sum(ans)