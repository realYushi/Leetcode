class Solution {
    Map<Integer,LinkedList<Integer>> map;
    Set<Integer> set;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        set= new HashSet<>();
        map= new HashMap<>();
        for(int i=0; i<numCourses; i++){
            map.put(i,new LinkedList<>());
        }
        
        for(int[] pair:prerequisites){
            map.get(pair[0]).add(pair[1]);
        }
        for(int i=0; i<numCourses; i++){
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
        set.remove(course);
        map.put(course,new LinkedList<>());
        return true;

    }
}