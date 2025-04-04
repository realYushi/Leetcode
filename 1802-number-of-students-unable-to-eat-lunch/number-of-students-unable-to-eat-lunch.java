class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int s :students){
            q.offer(s);
        }
        int eaten=0;
        for(int s:sandwiches){
            int att=0;
            int size=q.size();
            while(size!=att){
                if(q.peek()!=s){
                    q.offer(q.poll());
                    att++;
                }else{
                    q.poll();
                    eaten++;
                    break;
                }
            }
            if(att==size){
                break;
            }
        }
        return sandwiches.length-eaten;
        
    }
}