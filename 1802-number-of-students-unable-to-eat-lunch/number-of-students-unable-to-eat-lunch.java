class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q= new LinkedList<>();
        for(int s:students){
            q.offer(s);
        }
        int eaten=0;
        for(int s:sandwiches){
            int i=0;
            int size=q.size();
            while(i!=size){
                if(q.peek()==s){
                    q.poll();
                    eaten++;
                    break;
                }else{
                    i++;
                    q.offer(q.poll());
                }
            }
            if(i==size){
                break;
            }
        }
        return sandwiches.length-eaten;
        
    }
}