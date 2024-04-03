import java.util.Comparator;
import java.util.PriorityQueue;

public class ReverseQue{
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        p.add(12);
        p.add(13);
        p.add(1);
        p.add(10);
        System.err.println(p);
        while (!p.isEmpty()) {
          System.out.println(p.poll());     
       }
        // String str;
        // str=p.toString();
        // System.out.println(str);
    }
}
    

