class Solution {
    Map<Integer,List<Integer>> pre=new HashMap<>();
    Set<Integer> visited= new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            pre.put(i,new ArrayList<>());
        }
        for(int[] pc:prerequisites){
            pre.get(pc[0]).add(pc[1]);
        }
        for(int i=0; i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;

    }
    private boolean dfs(int course){
        if(visited.contains(course)){
            return false;
        }
        if(pre.get(course).isEmpty()){
            return true;
        }
        visited.add(course);
        for(int c:pre.get(course)){
            if(!dfs(c)){
                return false;
            }
        }
        visited.remove(course);
        pre.put(course,new ArrayList<>());
        return true;

    }
}