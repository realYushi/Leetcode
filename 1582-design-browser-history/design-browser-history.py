class BrowserHistory:

    def __init__(self, homepage: str):
        self.arr=[homepage]
        self.index=0
        self.rindex=self.index
        

    def visit(self, url: str) -> None:
        if len(self.arr)>self.index+1:
            self.arr[self.index+1]=url
        else:
            self.arr.append(url)
        
        self.index +=1
        self.rindex= self.index

    def back(self, steps: int) -> str:
        if steps>=self.index:
            self.index = 0
        else:
            self.index -= steps
        return self.arr[self.index]
    def forward(self, steps: int) -> str:
        if steps+self.index>=self.rindex:
            self.index=self.rindex
        else:
            self.index+=steps
        return self.arr[self.index]
        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)