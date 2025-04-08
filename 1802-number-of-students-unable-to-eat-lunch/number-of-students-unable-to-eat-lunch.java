class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i:students){
            q.offer(i);
        }
        int eaten=0;
        for(int i:sandwiches){
            int a=0;
            int size=q.size();
            while(a!=size){
                if(q.peek()==i){
                    eaten++;
                    q.poll();
                    break;
                }else{
                    a++;
                    q.offer(q.poll());
                }
            }
            if(a==size){
                break;
            }

        }
        return sandwiches.length-eaten;

        
    }
}