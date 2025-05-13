class Node{
    int k;
    int v;
    Node prev;
    Node next;
    public Node(int k, int v){
        this.k=k;
        this.v=v;
        this.prev=null;
        this.next=null;
    }
    public Node(){
        this.k=0;
        this.v=0;
        this.prev=null;
        this.next=null;
    }
}
class LRUCache {
    int cap;
    Node left;
    Node right;
    HashMap<Integer,Node> catche;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.catche=new HashMap<>();
        this.left=new Node();
        this.right=new Node();
        this.left.next=this.right;
        this.right.prev=this.left;
        
    }
    private void insert(Node node){
        node.next=this.right;
        node.prev=this.right.prev;
        node.next.prev=node;
        node.prev.next=node;
    }
    private void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    
    public int get(int key) {
        if(this.catche.containsKey(key)){
            Node node = this.catche.get(key);
            remove(node);
            insert(node);
            return node.v;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(this.catche.containsKey(key)){
            remove(this.catche.get(key));
        }
        Node node = new Node(key,value);
        this.catche.put(key,node);
        insert(node);
        if(this.catche.size() > this.cap){
            Node least=this.left.next;
            remove(least);
            this.catche.remove(least.k);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */