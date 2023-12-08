import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class file5 {
    static void reversingK(Queue<Integer> q,int n){
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q2=new LinkedList<>();
        while(n>0){
            s.push(q.remove());
            n--;
        }
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q2.isEmpty()) {
            q.add(q2.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reversingK(q,5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
