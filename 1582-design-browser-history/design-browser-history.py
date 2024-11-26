class BrowserHistory:

    def __init__(self, homepage: str):
        self.history=[homepage]
        self.index=0
        

    def visit(self, url: str) -> None:
        self.index+=1
        self.history=self.history[:self.index]
        self.history.append(url)
        

    def back(self, steps: int) -> str:
        self.index=max(self.index-steps,0)
        return self.history[self.index]
        

    def forward(self, steps: int) -> str:
        self.index=min(len(self.history)-1,self.index+steps)
        return self.history[self.index]
        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)