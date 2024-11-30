class Solution:
    def isValid(self, s: str) -> bool:
        rule={
            '}':'{',
            ')':'(',
            ']':'[',
        }
        stack=[]
        for c in s:
            if c in rule:
                if not stack or rule[c]!=stack[-1]:
                    return False
                stack.pop()
            else:
                stack.append(c)
        return True if not stack else False 


        