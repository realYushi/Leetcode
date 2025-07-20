class Solution {
    Map<Integer,List<Integer>>map;
    Set<Integer>set;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map=new HashMap<>();
        set= new HashSet<>();
        for(int i=0; i<numCourses; i++){
            map.put(i,new LinkedList<>());
        }
        for(int[] rule:prerequisites){
            map.get(rule[0]).add(rule[1]);
        }
        for(int i=0;i<numCourses; i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;

    }
    private boolean dfs(int course){
        if(set.contains(course)){
            return false;
        }
        if(map.get(course).isEmpty()){
            return true;
        }
        set.add(course);
        for(int pre:map.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }
        map.put(course,new LinkedList<>());
        set.remove(course);
        return true;

    }
}