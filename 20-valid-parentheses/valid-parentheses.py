class Solution:
    def isValid(self, s: str) -> bool:
        rule= {
            ']':'[',
            '}':'{',
            ')':'('
        }
        stack=[]
        for c in s:
            if c in rule:
                if stack and stack[-1] == rule[c]: 
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        return True if not stack else False
        