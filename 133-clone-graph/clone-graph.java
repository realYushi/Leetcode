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
        Map<Node, Node> map= new HashMap<>();
        Queue<Node> q= new LinkedList<>();
        map.put(node,new Node(node.val));
        q.add(node);
        while(!q.isEmpty()){
            Node cur=q.remove();
            for(Node nei:cur.neighbors){
                if(!map.containsKey(nei)){
                    map.put(nei,new Node(nei.val));
                    q.add(nei);
                }
                map.get(cur).neighbors.add(map.get(nei));
            } 
        }
        return map.get(node);

        
    }
}