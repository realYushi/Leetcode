class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int type : students){
            q.offer(type);
        }
        int size=q.size();
        for(int type:sandwiches){
            int counter=0;
            while(counter<size&&q.peek()!=type){
                q.offer(q.poll());
                counter++;
            }
            if(q.peek()==type){
                q.poll();
                size--;
            }else{
                return size;
            }
        }
        return size;
        
    }
}