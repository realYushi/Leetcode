class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int n = students.length;
        for(int s:students){
           q.offer(s);  
        }
        int res=n;
        for(int sa:sandwiches){
            int c = 0;
            while(c<res&&sa!=q.peek()){
                c++;
                q.offer(q.poll());
            }
            if(q.peek()==sa){
                q.poll();
                res--;
            }else{
                return res;
            }
        }
        return res;
    }
}