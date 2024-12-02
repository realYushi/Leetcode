class LinkedList:
    def __init__(self,val=0):
        self.next=None
        self.val=val
class MyLinkedList:
    def __init__(self):
        self.left=LinkedList()
        self.right=LinkedList()
        self.left.next=self.right
        self.size=0
    def get(self, index: int) -> int:
        if index >= self.size or index<0:
            return -1
        curr = self.left.next
        for _ in range(index ):
            curr=curr.next
        return curr.val
    def addAtHead(self, val: int) -> None:
        node = LinkedList(val)
        node.next=self.left.next
        self.left.next=node
        self.size+=1
    def addAtTail(self, val: int) -> None:
        node = LinkedList(val)
        curr=self.left
        while curr.next != self.right:
            curr=curr.next
        node.next=self.right
        curr.next=node
        self.size+=1
    def addAtIndex(self, index: int, val: int) -> None:
        if index > self.size or index <0:
            return 
        if index ==0:
            self.addAtHead(val)
            return 
        if index == self.size:
            self.addAtTail(val)
            return
        curr=self.left
        node = LinkedList(val)
        for _ in range(index):
            curr=curr.next
        node.next =curr.next
        curr.next=node
        self.size+=1
    def deleteAtIndex(self, index: int) -> None:
        if index >= self.size or index <0:
            return 
        curr  = self.left
        for  _ in range(index):
            curr=curr.next
        curr.next=curr.next.next
        self.size-=1

        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)