class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q1.add(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            q2.add(sandwiches[i]);
        }
        for(int k=0;k<students.length*students.length;k++){
            if(q1.isEmpty()){
                break;
            }
            if(q1.peek()==q2.peek()){
                q1.remove();
                q2.remove();
            }
            else{
                q1.add(q1.remove());
            }
            k++;
        }
        return q1.size();
    }
}
