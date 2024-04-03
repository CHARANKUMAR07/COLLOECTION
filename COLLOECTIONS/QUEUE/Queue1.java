import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> employee= new PriorityQueue<>();
        employee.offer("charan");
        employee.offer("bharath");
        employee.offer("boji");
        
        Queue<String> employee1= new PriorityQueue<>();
        employee1.offer("charan");
        employee1.offer("bharath");
       
       System.out.println(employee.containsAll(employee1));

       Queue<String> clonelist= new PriorityQueue<>();
       clonelist.addAll(employee);
       System.out.println(clonelist);
       System.out.println(clonelist.getClass());
       System.out.println(clonelist.hashCode());
       
       ArrayList<String> a=new ArrayList()<String>(employee);
       System.out.println(a);

      
       
    }
    
}
