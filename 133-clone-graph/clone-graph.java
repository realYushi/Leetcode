/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Map<Node,Node> old2new= new HashMap<>();
        Queue<Node> q= new LinkedList<>();
        old2new.put(node,new Node(node.val));
        q.add(node);
        while(!q.isEmpty()){
            Node cur= q.remove();
            for(Node nei:cur.neighbors){
                if(!old2new.containsKey(nei)){
                    old2new.put(nei,new Node(nei.val));
                    q.add(nei);
                }
                old2new.get(cur).neighbors.add(old2new.get(nei));
            }
        }
        return old2new.get(node);
        
    }
}