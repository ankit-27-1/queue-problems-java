import java.util.*;
public class file5 {
    static void generateBinary(int n){
        Queue<String> q=new LinkedList<String>();
        q.add("1");
        while(n-->0){
            String s1=q.peek();
            q.remove();
            System.out.println(s1);
            String s2=s1;
            q.add(s2+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        generateBinary(10);
    }
}
