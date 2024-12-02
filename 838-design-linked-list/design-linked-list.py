class LinkedList:
    def __init__(self, val=0):
        self.next = None
        self.val = val


class MyLinkedList:
    def __init__(self):
        self.left = LinkedList()  # Sentinel node for the head
        self.right = LinkedList()  # Sentinel node for the tail
        self.left.next = self.right
        self.size = 0

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1
        curr = self.left.next
        for _ in range(index):
            curr = curr.next
        return curr.val

    def addAtHead(self, val: int) -> None:
        node = LinkedList(val)
        node.next = self.left.next
        self.left.next = node
        self.size += 1

    def addAtTail(self, val: int) -> None:
        node = LinkedList(val)
        curr = self.left
        while curr.next != self.right:
            curr = curr.next
        node.next = self.right
        curr.next = node
        self.size += 1

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0 or index > self.size:
            return
        if index == 0:
            self.addAtHead(val)
            return
        if index == self.size:
            self.addAtTail(val)
            return
        node = LinkedList(val)
        curr = self.left
        for _ in range(index):
            curr = curr.next
        node.next = curr.next
        curr.next = node
        self.size += 1

    def deleteAtIndex(self, index: int) -> None:
        if index < 0 or index >= self.size:
            return
        curr = self.left
        for _ in range(index):
            curr = curr.next
        curr.next = curr.next.next
        self.size -= 1