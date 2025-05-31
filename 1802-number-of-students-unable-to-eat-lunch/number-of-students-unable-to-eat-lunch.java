class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int eaten = 0;
        for (int s : students) {
            q.add(s);
        }
        for (int s : sandwiches) {
            int len = q.size();
            int att = 0;
            while (att != len) {
                if (s == q.peek()) {
                    q.remove();
                    eaten++;
                    break;
                } else {
                    q.add(q.remove());
                    att++;
                }
            }
            if (att == len) {
                break;
            }
        }
        return sandwiches.length - eaten;

    }
}