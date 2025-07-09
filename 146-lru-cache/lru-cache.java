class Node{
    int val;
    int key;
    Node next;
    Node prev;
    public Node(int key,int val){
        this.val=val;
        this.key=key;
        this.next=null;
        this.prev=null;
    }
    public Node(){
        this.val=0;
        this.key=0;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    Map<Integer,Node> map;
    Node dummyHead;
    Node dummyTail;
    int cap;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.map= new HashMap<>();
        this.dummyHead= new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=dummyTail;
        this.dummyTail.prev=dummyHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        remove(map.get(key));
        add(map.get(key));
        return map.get(key).val;
    }
    private void add(Node node){
        node.next=this.dummyTail;
        node.prev=this.dummyTail.prev;
        node.prev.next=node;
        node.next.prev=node;
    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;

    }
    
    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(key)){
            remove(map.get(key));
            add(node);
            map.put(key,node);
        }else{
            if(map.size()==this.cap){
                Node lru = this.dummyHead.next;
                map.remove(lru.key);
                remove(lru);
            }
            map.put(key,node);
            add(node);
        }
    
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */