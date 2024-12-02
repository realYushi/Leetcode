class MinStack:

    def __init__(self):
        self.stack=[]
        self.mStack=[]
    def push(self, val: int) -> None:
        mVal=min(val,self.mStack[-1] if self.mStack else val)
        self.stack.append(val)
        self.mStack.append(mVal)
    def pop(self) -> None:
        self.stack.pop()
        self.mStack.pop()
    def top(self) -> int:
        return self.stack[-1]
    def getMin(self) -> int:
        return self.mStack[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()